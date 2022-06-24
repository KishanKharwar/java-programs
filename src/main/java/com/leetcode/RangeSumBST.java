package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST {
//[10,5,15,3,7,13,18,1,null,6]
//6
//10
  public static void main(String[] args) {
    int[] arr = {10,5,15,3,7,18};
    
    Node root = null;
    for(int i : arr){
      root = insert(root,i);
    }
    displayLevelOrder(root);
    int sum = rangeSumBST(root,7,15);
    System.out.println(sum);
  }
  static int sum = 0;
  public static int rangeSumBST(Node root, int low, int high){
    if(root == null){
      return 0;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){

      if(queue.element().data >= low && queue.element().data <= high){
        sum += queue.element().data;
      }

      if(queue.element().left!= null && queue.element().data >= low){
        queue.add(queue.element().left);
      }

      if(queue.element().right!= null && queue.element().data <= high){
        queue.add(queue.element().right);
      }

      queue.remove();

    }
    return sum;
  }

  private static Node insert(Node node, int data) {
    if(node == null){
      return new Node(data);
    }

    if(node.data > data){
      node.left = insert(node.left,data);
    }else if(node.data < data){
      node.right = insert(node.right,data);
    }
    return node;
  }

  private static void displayLevelOrder(Node root) {
    if (root == null) {
      return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(new Node(Integer.MAX_VALUE));
    while (!queue.isEmpty()) {
      if (queue.element().data == Integer.MAX_VALUE) {
        System.out.println();
        queue.remove();
        if (queue.size() > 0) {
          queue.add(new Node(Integer.MAX_VALUE));
        } else {
          break;
        }
      }

      if (queue.element().left != null) {
        queue.add(queue.element().left);
      }
      if (queue.element().right != null) {
        queue.add(queue.element().right);
      }

      System.out.print(queue.element().data + " ");
      queue.remove();
    }

  }
  
  static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
    }
  }
}
