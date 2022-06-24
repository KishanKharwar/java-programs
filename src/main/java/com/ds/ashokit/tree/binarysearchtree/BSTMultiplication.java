package com.ds.ashokit.tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BSTMultiplication {

  public static void main(String[] args) {
    int[] arr = {2, 17, 5, 4, 13, 200, 85, 9};
    Node root = createTree(null);
    displayLevelOrder(root);
    double sumL = printMultiplication(root,0);
    System.out.println(sumL);
  }

  private static double printMultiplication(Node root,double val){
    if(root == null){
      return 0;
    }

    val =val * Math.pow(10,calculateDigits(root.data)) + root.data;
    System.out.println(val);
    if(root.left == null && root.right == null){
      return val;
    }
    return printMultiplication(root.left,val) + printMultiplication(root.right,val);

  }

  private static int calculateDigits(int n){
    int count = 0;
    while(n>0){
      n = n/10;
      count++;
    }
    return count;
  }

  private static Node insert(Node root, int data, char ch) {
    if (root == null) {
      return new Node(data);
    }

    if (ch == 'l') {
      root.left = new Node(data);
    } else if (ch == 'r') {
      root.right = new Node(data);
    }
    return root;
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

  private static Node createTree(Node root) {
    root = insert(root, 2, ' ');
    insert(root, 17, 'l');
    insert(root, 5, 'r');
    insert(root.left, 4, 'r');
    insert(root.right, 85, 'l');
    insert(root.right, 9, 'r');
    insert(root.left.right, 13, 'l');
    insert(root.left.right, 200, 'r');
    return root;
  }

  static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }
}
