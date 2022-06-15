package com.pepcoding.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

//https://www.youtube.com/watch?v=5E3MeajU9XQ&list=PL-Jc9J83PIiGl_-iS5k7R7SZoZPt0Fab2&index=12
public class LowestCommonAncestorInBST {

  public static void main(String[] args) {
    int[] arr = {50, 25, 12, 37, 75, 62, 87,30,40,60,70,55,61,71,77};
    Node root = null;
    for (int i : arr) {
      root = insert(root, i);
    }
    levelOrder(root);
    System.out.println("-------------------------");
    int lca = lowestCommonAncestor(root,61,71);
    System.out.println(lca);
  }

  private static int lowestCommonAncestor(Node root, int d1, int d2) {
    if(root == null){
      return 0;
    }

    if(root.data >d1 && root.data>d2){
      return lowestCommonAncestor(root.left, d1, d2);
    }else if(root.data <d1 && root.data<d2){
      return lowestCommonAncestor(root.right, d1, d2);
    }else{
      return root.data;
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
