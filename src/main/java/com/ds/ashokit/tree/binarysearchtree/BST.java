package com.ds.ashokit.tree.binarysearchtree;

public class BST {

  public static void main(String[] args) {
    int[] arr = {12, 25, 37, 50, 62, 75, 87};
    Node root = createBST(arr, 0, arr.length - 1);
//    display(root);
//    int sum = sum(root);
//    System.out.println("Sum of all the nodes : " + sum);
//    int height = height(root);
//    System.out.println("Height of the tree : " + height);
//    int max = max(root);
//    System.out.println("Max of all the nodes is : " + max);
//    int min = min(root);
//    System.out.println("Min of all the nodes is : " + min);
//
//    boolean result = find(root, 87);
//    System.out.println("Number found ? " + result);
  }

  private static boolean find(Node root, int data) {
    if (root == null) {
      return false;
    }

    if (data > root.data) {
      return find(root.right, data);
    } else if (data < root.data) {
      return find(root.left,data);
    }else{
      return true;
    }
  }

  private static int max(Node root) {
    if (root.right != null) {
      return max(root.right);
    } else {
      return root.data;
    }
  }

  private static int min(Node root) {
    if (root.left != null) {
      return min(root.left);
    } else {
      return root.data;
    }
  }


  private static int height(Node root) {
    if (root == null) {
      return -1;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    int th = Math.max(lh, rh) + 1;
    return th;
  }

  private static int sum(Node root) {
    if (root == null) {
      return 0;
    }
    int ls = sum(root.left);
    int rs = sum(root.right);
    int ts = ls + rs + root.data;
    return ts;
  }

  public static Node createBST(int[] arr, int lo, int hi) {
    if (lo > hi) {
      return null;
    }

    int mid = (lo + hi) / 2;
    int data = arr[mid];
    Node ln = createBST(arr, lo, mid - 1);
    Node rn = createBST(arr, mid + 1, hi);
    Node root = new Node(data, ln, rn);
    return root;

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

  private static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
}
