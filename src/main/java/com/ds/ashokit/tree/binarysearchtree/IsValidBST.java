package com.ds.ashokit.tree.binarysearchtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsValidBST {

  public static void main(String[] args) {
    int[] arr = {5,1,4,3,6,};
    Node root = null;

    for(int i : arr){
      root = insert(root,i);
    }
    //levelOrder(root);
    System.out.println("Check whether the tree is valid BST or not ");
    int[] in = new int[arr.length];
    int[] inOrderArray = inOrder(root,in);
    System.out.println(Arrays.toString(inOrderArray));
//    boolean res = isValidBST(root);
//    System.out.println("Is Valid ? " + res);
  }

  static int i;
  private static int[] inOrder(Node root,int[] in) {
    if(root == null){
      return in;
    }

    inOrder(root.left,in);
    in[i++] = root.data;
    inOrder(root.right,in);

    return in;
  }

  private static int path(Node root, int a, int b){
    List<Node> l1 = new ArrayList<>();
    List<Node> l2 = new ArrayList<>();
    findPath(root,a,l1);
    findPath(root,b,l2);

    l1.retainAll(l2);
    int len1 = l1.size();
    return len1;
  }

  private static void findPath(Node root, int a, List<Node> list) {
    if(root == null){
      return;
    }

    if(a > root.data){
      list.add(root);
      findPath(root.right,a,list);
    }else if(a > root.data){
      list.add(root);
      findPath(root.left,a,list);
    }else{
      list.add(root);
    }

  }

  static int j;
  private static boolean isValidBST(Node root,int[] in) {
    if(root == null){
      return false;
    }

    isValidBST(root.left,in);
    if(in[j++] != root.data ){
      return false;
    }
    isValidBST(root.right,in);
    return true;
  }

  static Node prev = null;
  private static boolean isValid(Node root){
    if(root == null){
      return true;
    }
    if(!isValid(root.left)) {
      return false;
    }

    if(prev != null && prev.data > root.data){
      return false;
    }

    prev = root;

    if(!isValid(root.right)) {
      return false;
    }

    return true;
  }

  private static Node insert(Node root,int data){
    if(root == null){
      return new Node(data);
    }

    if (data < root.data) {
      root.left = insert(root.left, data);
    } else if (data >= root.data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  private static void levelOrder(Node root){
    if(root == null){
      return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(new Node(Integer.MAX_VALUE));
    while(!queue.isEmpty()){

      if(queue.element().data == Integer.MAX_VALUE){
        System.out.println();
        queue.remove();
        if(queue.size() > 0){
          queue.add(new Node(Integer.MAX_VALUE));
        }else{
          break;
        }
      }
      if(queue.element().left!=null){
        queue.add(queue.element().left);
      }

      if(queue.element().right!=null){
        queue.add(queue.element().right);
      }

      System.out.print(queue.element().data +  " ");
      queue.remove();
    }
  }

  static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
    }
  }
}
