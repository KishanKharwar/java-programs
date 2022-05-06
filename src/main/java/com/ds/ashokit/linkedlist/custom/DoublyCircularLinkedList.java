package com.ds.ashokit.linkedlist.custom;

public class DoublyCircularLinkedList {

  public static void main(String[] args) {
    addNElements(10);
  }

  private static DoublyNode addNElements(int n) {
    DoublyNode head = new DoublyNode(1);
    DoublyNode temp = head;
    for (int i = 2; i <= n; i++) {
      DoublyNode node = new DoublyNode(i);
      head.next = node;
      node.prev = head;
      head = head.next;

      if (head.next == null) {
        head.next = temp;
        temp.prev = head;
      }
    }

    System.out.println("Head " + head + ", Next " + head.next + ", Prev " + temp.prev);

    return temp;
  }
}
