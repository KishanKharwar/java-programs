package com.ds.ashokit.linkedlist.problems;

import java.util.LinkedList;

public class MergeSortedLinkedList {

  private static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    MergeSortedLinkedList ll1 = new MergeSortedLinkedList();
    Node h1 = ll1.add(null, -3);
    ll1.add(h1, 5);
    ll1.add(h1, 8);
    ll1.add(h1, 20);
    ll1.add(h1, 25);
    printLinkedList(h1);

    MergeSortedLinkedList ll2 = new MergeSortedLinkedList();
    Node h2 = ll1.add(null, -1);
    ll2.add(h2, 2);
    ll2.add(h2, 4);
    ll2.add(h2, 7);
    ll2.add(h2, 11);
    ll2.add(h2, 13);
    ll2.add(h2, 16);
    ll2.add(h2, 18);
    printLinkedList(h2);

    LinkedList ll = mergeSortedLinkedLists(h1, h2);
    System.out.println(ll);
  }

  private static LinkedList mergeSortedLinkedLists(Node h1, Node h2) {

    Node one = h1;
    Node two = h2;

    LinkedList ll = new LinkedList();

    while (one != null && two != null) {
      if (one.data < two.data) {
        ll.addLast(one.data);
        one = one.next;
      } else {
        ll.addLast(two.data);
        two = two.next;
      }
    }

    while (one != null) {
      ll.addLast(one.data);
      one = one.next;
    }

    while (two != null) {
      ll.addLast(two.data);
      two = two.next;
    }

    return ll;
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
