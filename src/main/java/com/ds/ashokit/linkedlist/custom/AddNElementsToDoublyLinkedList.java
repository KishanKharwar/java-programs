package com.ds.ashokit.linkedlist.custom;

public class AddNElementsToDoublyLinkedList {

  public static void main(String[] args) {
    addNElements(10);
  }

  private static DoublyNode addNElements(int n) {

    DoublyNode head = new DoublyNode(1);
    DoublyNode temp = head;
    System.out.println("Adding " + head);
    for (int i = 2; i <= n; i++) {
      DoublyNode node = new DoublyNode(i);
      head.next = node;
      node.prev = head;
      head = head.next;
      System.out.println("Adding " + node + " Prev : " + node.prev + " Next : " + head.next);
    }

    return temp;
  }
}
