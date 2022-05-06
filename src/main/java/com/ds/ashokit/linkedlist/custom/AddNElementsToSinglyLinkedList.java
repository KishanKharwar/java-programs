package com.ds.ashokit.linkedlist.custom;

public class AddNElementsToSinglyLinkedList {

  public static void main(String[] args) {
    addNElements(10);
  }

  private static Node addNElements(int n) {
    Node head = new Node(1);
    Node temp = head;
    System.out.println("Adding " + head);
    for (int i = 2; i <= n; i++) {
      Node node = new Node(i);
      head.next = node;

      head = head.next;
      System.out.println("Adding " + node);
    }
    return temp;
  }


}
