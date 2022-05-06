package com.ds.ashokit.linkedlist;

public class InsertIntoLinkedList {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    Node n = list.add(1);
    System.out.println(n);

    Node n1 = list.add(2);
    System.out.println(n1);
    System.out.println(list.size);
  }

  static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }

    @Override
    public String toString() {
      return "Node : " + data;
    }
  }

  static class LinkedList {

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
}
