package com.ds.ashokit.tree.binarysearchtree;


import org.junit.Test;

public class BSTAddNewNode {

  public static void main(String[] args) {
    int[] arr = {12, 25, 37, 50, 62, 75, 87};
    //int[] arr = {3 ,2 ,4 ,1 ,5 };
    Node root = createBST(arr, 0, arr.length - 1);


    root = add(root,97);
    display(root);
    System.out.println("----------------------");

    root = remove(root,25);
    display(root);
    System.out.println();

//    Node n = add(root,17);
//    display(n);
  }

  @Test
  private static Node remove(Node root, int data) {
    if(root == null){
      return null;
    }

    if(data<root.data){
      root.left = remove(root.left,data);
    }else if(data>root.data){
      root.right = remove(root.right,data);
    }else{
      if(root.left != null && root.right != null){
        int lmax = max(root.left);
        root.data = lmax;
        root.left = remove(root.left,lmax);
        return root;
      }else if(root.left != null){
        return root.left;
      }else if(root.right != null){
        return root.right;
      }else{
        return null;
      }
    }
    return root;
  }

  private static int max(Node root){

    if(root.right != null){
      return max(root.right);
    }else{
      return root.data;
    }

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
