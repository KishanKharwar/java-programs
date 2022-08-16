package com.ds.ashokit.linkedlist.problems;

public class MiddleElement {

  private static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    //For even number of elements in Linked List
    MiddleElement element = new MiddleElement();
    Node h = element.add(null, 1);
    element.add(h, 7);
    element.add(h, 2);
    element.add(h, 6);
    element.add(h, 3);
    element.add(h, 9);
    printLinkedList(h);
    int mid = findMiddleElement(h);
    System.out.println("Mid Element : " + mid);

    // for odd number of elements in Linked List
//    MiddleElement element = new MiddleElement();
//    Node h = element.add(null,3);
//    element.add(h,5);
//    element.add(h,8);
//    element.add(h,4);
//    element.add(h,10);
//    printLinkedList(h);
//    int mid = findMiddleElement(h);
//    System.out.println("Mid Element : "+mid);

  }

  private static int findMiddleElement(Node h) {
    Node slow = h;
    Node fast = h;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow.data;
  }


  private Node add(Node head, int data) {
    Node temp = head;
    Node node = new Node(data);

    if (head == null) {
      temp = head = node;
      return temp;
    }

    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = node;
    return temp;
  }

  private static void printLinkedList(Node h) {
    if (h == null) {
      return;
    }

    while (h != null) {
      System.out.print(h.data + "->");
      h = h.next;
    }
    System.out.println();
  }
}
