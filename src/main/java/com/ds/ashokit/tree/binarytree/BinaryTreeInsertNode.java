package com.ds.ashokit.tree.binarytree;

import java.util.Stack;

public class BinaryTreeInsertNode {

  public static void main(String[] args) {

    Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null,
        87, null, null};

    Node node = new Node(arr[0], null, null);
    Pair rootPair = new Pair(node, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rootPair);
    int idx = 0;
    while (!st.isEmpty()) {

      Pair top = st.peek();

      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          Node ln = new Node(arr[idx], null, null);
          top.node.left = ln;
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }
        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          Node rn = new Node(arr[idx], null, null);
          top.node.right = rn;
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }
        top.state++;
      } else {
        st.pop();
      }
    }
    //display(node);
    //inOrder(node);
    preOrder(node);
    System.out.println();
    postOrder(node);
  }


  private static void display(Node node) {
    if (node == null) {
      return;
    }

    StringBuilder builder = new StringBuilder();
    builder.append(node.left == null ? "." : node.left.data + "");
    builder.append(" <- " + node.data + " -> ");
    builder.append(node.right == null ? "." : node.right.data + "");
    System.out.println(builder.toString());
    display(node.left);
    display(node.right);

  }

  //DLR
  private static void inOrder(Node node){
    if(node == null){
      return;
    }
    System.out.print(node.data + " ");
    inOrder(node.left);
    inOrder(node.right);
  }

  //LDR
  private static void preOrder(Node node){
    if(node == null){
      return;
    }

    preOrder(node.left);
    System.out.print(node.data + " ");
    preOrder(node.right);
  }

  //LRD
  private static void postOrder(Node node){
    if(node == null){
      return;
    }

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " ");
  }

  private static int size(Node node){
    if(node == null){
      return 0;
    }
    int ls = size(node.left);
    int rs = size(node.right);
    return ls + rs + 1;
  }

  private static int sum(Node node){
    if(node == null){
      return 0;
    }

    int ls = sum(node.left);
    int rs = sum(node.right);
    int ts = ls + rs + node.data;

    return ts;
  }

  private static int max(Node node){
    if(node == null){
      return Integer.MIN_VALUE;
    }

    int lm = max(node.left);
    int rm = max(node.right);

    int tm = Math.max(node.data,Math.max(lm,rm));
    return tm;
  }


  private static int height(Node node){
    if(node == null){
      return -1;
    }
    int lh = height(node.left);
    int rh = height(node.right);
    int th = Math.max(lh,rh) + 1;
    return th;
  }
  private static class Pair {

    Node node;
    int state;

    public Pair(Node node, int state) {
      this.state = state;
      this.node = node;
    }
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
