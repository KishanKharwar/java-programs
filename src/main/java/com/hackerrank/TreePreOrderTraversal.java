package com.hackerrank;

public class TreePreOrderTraversal {

  public static void main(String[] args) {
    //int[] arr = {3 ,2 ,4 ,1 ,5 };
    int[] arr = {1,2,3,4,5};
    Node root = null;

    for(int k = 0;k<arr.length;k++){
      root = createBST(root,arr[k]);
    }

    display(root);
    System.out.println();
  }

  private static Node createBST(Node root, int data){
    if(root == null){
      return new Node(data,null,null);
    }

    if(data>root.data){
      root.right= createBST(root.right,data);
    }else{
      root.left = createBST(root.left,data);
    }
    return root;
  }

  private static Node createBST(int[] arr, int lo, int hi){
    if(lo>hi){
      return null;
    }

    int mid = (lo + hi)/2;
    int data = arr[mid];
    Node ln = createBST(arr,lo,mid-1);
    Node rn = createBST(arr,mid+1,hi);
    Node root = new Node(data,ln,rn);
    return root;
  }

  private static void displayPreOrder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.data + " ");
    displayPreOrder(root.left);

    displayPreOrder(root.right);

  }

  public static void display(Node root){
    if(root == null){
      return;
    }

    String str = "";
    str += root.left == null? "." : root.left.data + "";
    str += " <- " + root.data + " -> ";
    str += root.right == null ? "." : root.right.data+"";

    System.out.println(str);
    display(root.left);
    display(root.right);
  }

  static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data,Node left,Node right){
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
}
