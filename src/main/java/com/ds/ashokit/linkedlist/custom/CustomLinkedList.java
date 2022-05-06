package com.ds.ashokit.linkedlist.custom;


public class CustomLinkedList {

  Node head;
  int size;

  // Method to add the data to the end of the linked list return the head node.
  public Node add(int data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
      size++;
      return head;
    }

    Node temp = head;
    head.next = node;
    head = head.next;
    size++;

    return temp;
  }

  public int size() {
    return size;
  }
}
