package com.ds.ashokit.tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

  public static void main(String[] args) {
    int[] arr = {7, 10, 2, -6, 15, 9, 4, 3, 5, 12, -8};
    Node root = null;
    for (int i : arr) {
      root = insert(root, i);
    }
    levelOrder(root);
  }

  private static void levelOrder(Node root) {
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

  private static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }
    if (data < root.data) {
      root.left = insert(root.left, data);
    } else if (data >= root.data) {
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
