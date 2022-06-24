package com.leetcode;

public class ValidBST {

  public static void main(String[] args) {
    int[] arr = {2,1,3};
    Node root = null;
    for(int i : arr){
      root = insert(root,i);
    }

    postOrder(root);
    System.out.println();
    boolean res = isValidBST(root);
    System.out.println(res);
  }

  static int min = Integer.MIN_VALUE;
  public static boolean isValidBST(Node root) {
    if(root == null){
      return true;
    }

    isValidBST(root.left);

    if(min < root.val){
      min = root.val;
    }else{
      return false;
    }
    isValidBST(root.right);

    return true;
  }


  private static Node insert(Node root,int data){
    if(root == null){
      return new Node(data);
    }
    if(data < root.val){
      root.left = insert(root.left,data);
    }else{
      root.right = insert(root.right,data);
    }

    return root;
  }

  public static void postOrder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.val + " ");
    postOrder(root.left);
    postOrder(root.right);

  }

  public static void display(Node root){
    if(root == null){
      return;
    }

    String str = "";
    str += root.left == null? "." : root.left.val + "";
    str += " <- " + root.val + " -> ";
    str += root.right == null ? "." : root.right.val+"";

    System.out.println(str);
    display(root.left);
    display(root.right);
  }
  
  static class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
      this.val = val;
    }
  }
}
