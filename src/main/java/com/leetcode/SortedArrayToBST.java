package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class SortedArrayToBST {

  public static void main(String[] args) {
    int[] arr = {-10,-3,0,5,9};
    Node root = createBST(arr,0,arr.length-1);
    displayLevelOrder(root);
  }

  private static Node createBST(int[] arr, int lo, int hi) {
    if(lo>hi){
      return null;
    }

    int mid = (lo + hi)/2;
    int data = arr[mid];

    Node ln = createBST(arr,lo,mid-1);
    Node rn = createBST(arr,mid + 1,hi);

    Node node = new Node(data,ln,rn);

    return node;
  }

  private static void displayLevelOrder(Node root) {
    if(root == null){
      return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(new Node(Integer.MAX_VALUE));

    while(!queue.isEmpty()){

      if(queue.element().data == Integer.MAX_VALUE){
        System.out.println();
        queue.remove();
        if(queue.size()>0){
          queue.add(new Node(Integer.MAX_VALUE));
        }else{
          break;
        }
      }
      if(queue.element().left != null){
        queue.add(queue.element().left);
      }
      if(queue.element().right != null){
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
    public Node(int data,Node left, Node right){
     this.data = data;
     this.left = left;
     this.right = right;
    }
  }
}
