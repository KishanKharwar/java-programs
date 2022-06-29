package com.ds.ashokit.tree.binarytree;

import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderTraversal {

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.left.right = new Node(8);
    root.right.right.right = new Node(9);
    System.out.println("Vertical Order traversal is");
    printVerticalOrder(root);
  }

  private static void getVerticalOrder(Node root, int headIndex, TreeMap<Integer, Vector<Integer>> map) {
    if(root == null){
      return;
    }

    Vector<Integer> temp = map.get(headIndex);

    if(temp == null){
      temp = new Vector<>();
      temp.add(root.data);
    }else{
      temp.add(root.data);
    }

    map.put(headIndex,temp);

    getVerticalOrder(root.left,headIndex-1,map);
    getVerticalOrder(root.right,headIndex+1,map);
  }

  private static void printVerticalOrder(Node root) {
    TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
    int headIndex = 0;
    getVerticalOrder(root, headIndex, map);
    for (Map.Entry<Integer, Vector<Integer>> entry : map.entrySet()) {
      System.out.println(entry.getValue());
    }
  }


  static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }
}
