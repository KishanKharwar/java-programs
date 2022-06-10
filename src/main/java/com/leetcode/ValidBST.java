package com.leetcode;

public class ValidBST {

  public static void main(String[] args) {
    int[] arr = {2,1,3};
    Node root = null;
    for(int i : arr){
      root = insert(root,i);
    }

    postOrder(root);
    boolean res = isValidBST(root);
    System.out.println(res);
  }
  public static boolean isValidBST(Node root) {
    if(root == null){
      return true;
    }
    Node temp = root;
    if(root.left != null && root.left.val < root.val){
      return isValidBST(root.left);
    }else if(root.right != null && root.right.val > root.val){
      return isValidBST(root.right);
    }else{
      return false;
    }

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
