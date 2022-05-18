package com.ds.ashokit.custom.linkedlist;

public class MergeTwoSortedLinkedList {

  public static void main(String[] args) {
    int[] arrOdd = {1,3,5,7,9};
    int[] arrEven = {2,4,6,8,10};
    Node headOdd = createSinglyLinkedList(arrOdd);
    printLinkedList(headOdd);
    Node headEven = createSinglyLinkedList(arrEven);
    printLinkedList(headEven);

    Node mergedList = mergeSortedList(headEven,headOdd);
    printLinkedList(mergedList);
  }

  private static Node mergeSortedList(Node headEven, Node headOdd) {
    Node head = new Node(0);
    Node temp = head;

    while(headEven!= null && headOdd != null){
      if(headEven.data> headOdd.data){
        temp.next = headOdd;
        headOdd = headOdd.next;
      }else {
        temp.next = headEven;
        headEven = headEven.next;
      }
      temp = temp.next;
    }

    while(headOdd != null){
      temp.next = headOdd;
      headOdd = headOdd.next;
      temp = temp.next;
    }

    while(headEven != null){
      temp.next = headEven;
      headEven = headEven.next;
      temp = temp.next;
    }

    return head.next;
  }

  private static Node createSinglyLinkedList(int[] arrOdd) {
    Node head = new Node(arrOdd[0]);
    Node temp = head;
    int i = 1;
    while(i<arrOdd.length){
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
    public Node(int data){
      this.data = data;
    }
  }
}


