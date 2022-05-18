package com.ds.ashokit.custom.linkedlist;


public class MergeSortInLinkedList {

  public static void main(String[] args) {
    int[] arr = {3, 5, 8, -1, 2, 9, 4,1};


    Node head = createSinglyLinkedList(arr);
    printLinkedList(head);
//    Node mid = findMidNode(head);
//    printLinkedList(mid);

    Node mergedList = mergeSort(head);
    printLinkedList(mergedList);
  }

  private static Node mergeSort(Node head) {

    if (head == null || head.next == null) {
      return head;
    }

    Node mid = findMidNode(head);
    Node nHead = mid.next;
    mid.next = null;

    Node firstHalf = mergeSort(head);
    Node secondHalf = mergeSort(nHead);
    Node result = mergeSortedList(firstHalf, secondHalf);

    return result;
  }

  private static Node mergeSortedList(Node firstHalf, Node secondHalf) {
    Node head = new Node(0);
    Node temp = head;

    while (firstHalf != null && secondHalf != null) {
      if (firstHalf.data > secondHalf.data) {
        head.next = secondHalf;
        secondHalf = secondHalf.next;
      } else {
        head.next = firstHalf;
        firstHalf = firstHalf.next;
      }
      head = head.next;
    }

    if(secondHalf != null){
      head.next = secondHalf;
    }

    if(firstHalf != null){
      head.next = firstHalf;
    }
    return temp.next;
  }

  private static Node findMidNode(Node head) {
    Node fast = head;
    Node slow = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private static Node createSinglyLinkedList(int[] arrOdd) {
    Node head = new Node(arrOdd[0]);
    Node temp = head;
    int i = 1;
    while (i < arrOdd.length) {
      temp.next = new Node(arrOdd[i]);
      temp = temp.next;
      i++;
    }
    return head;
  }
  private static void printLinkedList(Node head) {

    while (head != null) {
      System.out.print(head.data + "->");
      head = head.next;
    }
    System.out.println();
  }

  static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
