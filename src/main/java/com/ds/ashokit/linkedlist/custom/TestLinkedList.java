package com.ds.ashokit.linkedlist.custom;

public class TestLinkedList {

  static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  private static int size;

  public static void main(String[] args) {
    Node h = add(null, 1);
    //add(h, 1);
    add(h, 3);
    add(h, 3);
    add(h, 3);
    add(h, 5);
    add(h, 5);
//    add(h, 7);
//    add(h, 7);
//    add(h, 9);

//    Node h = insertAtHead(null, 3);
//    insertAtHead(h, 5);
//    insertAtHead(h, 7);
//    insertAtHead(h, 10);
//    insertAtHead(h, 12);

    printLL(h);
    unique(h);
    printLL(h);
    //insertInSortedLinkedList(h,9);
    //deleteAllTheOccurances(h, 3);
    //printLL(h);
  }

  private static Node unique(Node h) {
    if (h == null) {
      return h;
    }

    Node temp = h;
    while (h.next != null) {
      if (h.next.data == h.data) {
        h = h.next.next;
      } else {
        h = h.next;
      }
    }

    return temp;
  }

  private static Node add(Node h, int data) {
    Node temp = h;
    Node node = new Node(data);
    if (h == null) {
      temp = node;
      size++;
      return temp;
    }

    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = node;
    size++;
    return temp;
  }

  private static void printLL(Node h) {
    Node temp = h;
    System.out.print(temp.data);
    while (temp.next != null) {
      temp = temp.next;
      System.out.print(" -> " + temp.data);
    }
    System.out.println();
  }

  // 1->1->3->3->7->7->8->8-> : delete 3, then 1->1->7->7->8->8->
  private static Node deleteAllTheOccurances(
      Node h, int data) {
    Node temp = h;

    while (temp.next != null) {
      if (temp.next.data == data) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }

    }
    return temp;
  }

  private static int size() {
    return size;
  }

  private static Node insertInSortedLinkedList(Node h, int data) {
    Node temp = null;
    Node current = h;
    while (current.next != null && current.data < data) {
      temp = current;
      current = current.next;
    }

    Node node = new Node(data);
    node.next = current;
    temp.next = node;

    return h;
  }


  private static Node insertAtHead(Node h, int data) {
    Node node = new Node(data);
    if (h == null) {
      return node;
    }

    node.next = h;
    h = node;
    return h;
  }

}
