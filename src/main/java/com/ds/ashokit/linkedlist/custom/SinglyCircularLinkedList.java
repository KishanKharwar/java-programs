package com.ds.ashokit.linkedlist.custom;

public class SinglyCircularLinkedList {

  public static void main(String[] args) {
    addNElements(10);
  }

  private static Node addNElements(int n) {
    Node head = new Node(1);
    Node temp = head;
    //System.out.println("Adding " + head);
    for (int i = 2; i <= n; i++) {
      Node node = new Node(i);
      head.next = node;
      head = head.next;
      if (head.next == null) {
        head.next = temp;
      }

      //System.out.println("Adding " + node + " Next : " + head);
    }
    System.out.println("head " + head);
    System.out.println("head.next " + head.next);
    return temp;
  }
}
