package com.ds.ashokit.tree.binarytree;

import java.util.Stack;

public class IterativeApproachTraversal {

  public static void main(String[] args) {
//    Node root = new Node(10);
//    root.left = new Node(8);
//    root.right = new Node(2);
//    root.left.left = new Node(3);
//    root.left.right = new Node(5);
//    root.right.left = new Node(2);
//    iterativePreorder(root);


    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    iterativeInOrder(root);
  }

  private static void iterativeInOrder(Node root){
    if(root == null){
      return;
    }

    Stack<Node> stack = new Stack<>();
    Node curr = root;
    while(curr != null || !stack.isEmpty()){

      while(curr!= null){
        stack.push(curr);
        curr = curr.left;
      }

      curr = stack.pop();
      System.out.print(curr.data + " ");

      curr = curr.right;
    }
  }

  private static void iterativePreorder(Node root) {
    if(root == null){
      return;
    }

    Stack<Node> stack = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()){
      Node curr = stack.peek();
      System.out.print(curr.data + " ");
      stack.pop();

      if(curr.right != null){
        stack.push(curr.right);
      }

      if(curr.left != null){
        stack.push(curr.left);
      }
    }
  }

  static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
    }
  }
}
