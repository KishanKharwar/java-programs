package com.pepcoding.tree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {

  public static void main(String[] args) {
    int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40,
        100, -1, -1, -1};
    Node root = createGenericTree(arr);
    display(root);

    int size = size(root);
    System.out.println("Size : " + size);

    int max = max(root);
    System.out.println("Max Node : " + max);
  }

  private static Node createGenericTree(int[] arr) {
    Node root = null;
    Stack<Node> stack = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (!stack.isEmpty() && arr[i] == -1) {
        stack.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];
        if (!stack.isEmpty()) {
          stack.peek().children.add(t);
        } else {
          root = t;
        }

        stack.push(t);
      }

    }
    return root;
  }

  private static void display(Node root) {
    StringBuilder builder = new StringBuilder();
    builder.append(root.data + "->");
    //String str = root.data + "->";
    for (Node child : root.children) {
      //str+=child.data + ",";
      builder.append(child.data + ",");
    }
    //str+=".";
    builder.append(".");
    System.out.println(builder.toString());
    for (Node child : root.children) {
      display(child);
    }
  }

  private static int size(Node root) {
    int size = 0;

    for (Node child : root.children) {
      int childSize = size(child);
      size = size + childSize;
    }
    size = size + 1;

    return size;
  }

  private static int max(Node root) {
    int max = Integer.MIN_VALUE;
    for (Node child : root.children) {
      int childMax = max(child);
      max = Math.max(max, childMax);
    }
    max = Math.max(max, root.data);
    return max;
  }

  private static class Node {

    int data;
    ArrayList<Node> children = new ArrayList<>();
  }
}
