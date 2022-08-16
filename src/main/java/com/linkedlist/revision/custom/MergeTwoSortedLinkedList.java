package com.linkedlist.revision.custom;


import java.util.LinkedList;

public class MergeTwoSortedLinkedList {

  public static void main(String[] args) {
    Node root = new Node(1);
    add(root,3);
    add(root,5);
    add(root,7);
    add(root,9);
    printLinkedList(root);
    System.out.println();

    Node h2 = new Node(2);
    add(h2,4);
    add(h2,6);
    add(h2,8);
    add(h2,10);
    printLinkedList(h2);
    System.out.println();

    LinkedList list = mergeSortedLinkedList(root,h2);
    System.out.println(list);
  }

  private static LinkedList mergeSortedLinkedList(Node root, Node h2) {
    Node one = root;
    Node two = h2;

    LinkedList list = new LinkedList();
    while(one != null && two != null){
      if(one.data < two.data){
        list.addLast(one.data);
        one = one.next;
      }else{
        list.addLast(two.data);
        two = two.next;
      }
    }

    while(one != null){
      list.addLast(one.data);
      one = one.next;
    }

    while(two != null){
      list.addLast(two.data);
      two = two.next;
    }
    return list;
  }

  private static Node add(Node root, int data) {
    Node node = new Node(data);
    if (root == null) {
      return node;
    }

    Node temp = root;
    while (root.next != null) {
      root = root.next;
    }
    root.next = node;

    return temp;
  }

  private static void printLinkedList(Node root) {
    if(root == null){
      return;
    }
    System.out.print(root.data + " ->");
    printLinkedList(root.next);
  }

  static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
