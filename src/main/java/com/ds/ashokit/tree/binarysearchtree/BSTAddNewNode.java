package com.ds.ashokit.tree.binarysearchtree;


public class BSTAddNewNode {

  public static void main(String[] args) {
    int[] arr = {12, 25, 37, 50, 62, 75, 87};
    //int[] arr = {3 ,2 ,4 ,1 ,5 };
    Node root = createBST(arr, 0, arr.length - 1);
    display(root);
    System.out.println();
//    Node n = add(root,17);
//    display(n);
  }

  private static Node add(Node node, int data){

    if(node == null){
      return new Node(data,null,null);
    }
    if(data > node.data){
      node.right = add(node.right,data);
    }else if(data < node.data){
      node.left = add(node.left,data);
    }else{
      //nothing
    }
    return node;
  }

  private static Node createBST(int[] arr, int lo, int hi) {
    if(lo>hi){
      return null;
    }
    int mid = (lo + hi)/2;
    int data = arr[mid];
    Node ln = createBST(arr,lo,mid-1);
    Node rn = createBST(arr,mid+1,hi);
    Node node = new Node(data,ln,rn);
    return node;
  }

  private static void display(Node root) {
    if (root == null) {
      return;
    }

    String str = "";
    str = root.left == null ? " . " : root.left.data + "";
    str += " <- " + root.data + " -> ";
    str += root.right == null ? " . " : root.right.data + "";
    System.out.println(str);
    display(root.left);
    display(root.right);
  }
  
  private static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data, Node left, Node right){
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
}
