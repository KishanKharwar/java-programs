package com.test.bikram.test;

public class LinkedList {


  static class Node { // inner class

    int data;
    Node addressNext;
    Node addressPrev;

    Node(int data) {
      this.data = data;
      addressNext = null;
      addressPrev = null;
    }
  }

  public static void main(String[] args) {
    int n = 5;
    Node nodeReturned = createSinglyLinkedList(n); // insert linked list
    // System.out.println(nodeReturned);

    // delete at pos 2

    Node head = deleteNodeAt2(nodeReturned, 2);
    printLL(head);
    while (nodeReturned != null) {// print in linked list
      nodeReturned = nodeReturned.addressNext;
      System.out.println(nodeReturned + " :after: " + nodeReturned.data);
    }
  }

  private static void printLL(Node h ){
    while(h.addressNext!= null){
      System.out.println(h.data);
      h = h.addressNext;
    }
  }

  private static Node deleteNodeAt2(Node nodeReturned, int pos) {
    int currentPos = 0;
    Node temp = nodeReturned;
    while (nodeReturned!= null && currentPos < pos) {// traverse
      currentPos++;
      nodeReturned = nodeReturned.addressNext;
    }
    // now i am at that position
    nodeReturned.addressNext = nodeReturned.addressNext.addressNext;
   // System.out.println(nodeReturned + " :internal end: " + nodeReturned.data);
    return temp;
  }

  private static Node createSinglyLinkedList(int n) {
    Node head = new Node(1);
    Node temp = head;
    for (int i = 2; i <= n; i++) {
      Node newNode = new Node(i);
      head.addressNext = newNode;
      head = head.addressNext;
    }
    return temp;

  }

}
