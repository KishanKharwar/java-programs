package com.ds.ashokit.tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class FindDistanceBetweenTwoNodes {

  public static void main(String[] args) {
    int[] arr = {50, 25, 12, 37, 75, 62, 87, 30, 40, 60, 70, 55, 61, 71, 77};
    Node root = null;
    for (int i : arr) {
      root = insert(root, i);
    }
    levelOrder(root);
    System.out.println("-------------------------");

    //System.out.println(find(root,87,0) + find(root,62,0));

    int distance = distance(root,25,75);
    System.out.println("Distance : "+distance);
  }

  public static int distance(Node root, int d1, int d2){
    if(root == null){
      return -1;
    }

    if(d1 > root.data && d2 > root.data){
      //right side
      Node nRoot = lca(root.right, d1, d2);
      System.out.println("LCA : " + nRoot.data);
      if(nRoot.data > d1){
        return find(root, nRoot.data, 0) + find(nRoot.left,d1,0) + find(nRoot.right,d2,0) + ((nRoot.right == null || nRoot.left == null) ? 1: 2);
      }else{
        return find(root, nRoot.data, 0) + find(nRoot.left,d2,0) + find(nRoot.right,d1,0) + ((nRoot.right == null || nRoot.left == null) ? 1: 2);
      }
    }else if(d1 < root.data && d2 < root.data){
      //left side
      Node nRoot = lca(root.left, d1, d2);
      System.out.println("LCA : " + nRoot.data);
      if(nRoot.data > d1){
        return find(root, nRoot.data, 0) +  find(nRoot.left,d1,0) + find(nRoot.right,d2,0) + ((nRoot.right == null || nRoot.left == null) ? 1: 2);
      }else{
        return find(root, nRoot.data, 0) +  find(nRoot.left,d2,0) + find(nRoot.right,d1,0) + ((nRoot.right == null || nRoot.left == null) ? 1: 2);
      }

    }else{
      if(root.data > d1 && root.data<d2){
        int ls = find(root.left,d1,0) + 1;
        int rs = find(root.right,d2,0) + 1;
        return  ls + rs;
      }else{
        return find(root.left,d2,0) + find(root.right,d1,0) + ((root.right == null || root.left == null) ? 1: 2);
      }
    }
  }

  private static Node lca(Node root,int d1, int d2){
    if(root == null){
      return null;
    }

    if(d1 > root.data && d2 > root.data){
      return lca(root.right, d1, d2);
    }else if(d1 < root.data && d2 < root.data){
      return lca(root.left, d1, d2);
    }else{
      return root;
    }
  }

  private static int find(Node root,int d1,int count){
    if(root == null){
      return 0;
    }

    if(root.data > d1){
      count++;
      return find(root.left, d1, count);
    }else if (root.data < d1){
      count++;
      return find(root.right, d1, count);
    }
    else{
      return count;
    }
  }

  public static void levelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(new Node(Integer.MAX_VALUE));
    while (!queue.isEmpty()) {
      if (queue.element().data == Integer.MAX_VALUE) {
        System.out.println();
        queue.remove();
        if (queue.size() > 0) {
          queue.add(new Node(Integer.MAX_VALUE));
        } else {
          break;
        }
      }
      if (queue.element().left != null) {
        queue.add(queue.element().left);
      }
      if (queue.element().right != null) {
        queue.add(queue.element().right);
      }
      System.out.print(queue.element().data + " ");
      queue.remove();
    }
  }

  public static int max(Node root) {
    if (root == null) {
      return 0;
    }

    if (root.right != null) {
      return max(root.right);
    } else {
      return root.data;
    }
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }

    if (root.data > data) {
      root.left = insert(root.left, data);
    } else if (root.data <= data) {
      root.right = insert(root.right, data);
    }

    return root;
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
