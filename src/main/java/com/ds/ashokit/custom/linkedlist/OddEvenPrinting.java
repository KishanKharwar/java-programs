package com.ds.ashokit.custom.linkedlist;

public class OddEvenPrinting {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Node head = createSinglyLinkedList(arr);
    printLinkedList(head);

    Node oddEven = getOddAndEvenLinkedList(head);
    printLinkedList(oddEven);
  }

  private static Node getOddAndEvenLinkedList(Node head) {
    // have 2 nodes odd and even
    Node odd = new Node(0);
    Node even = new Node(0);
    Node tempOdd = odd, tempEven = even;

    // store the data into each nodes
    while(head!= null){
      if(head.data % 2 == 0){
        tempEven.next = head;
        tempEven = tempEven.next;
      }else {
        tempOdd.next = head;
        tempOdd = tempOdd.next;
      }
      head = head.next;
    }
    // map odd.next to even.next
    tempOdd.next = even.next;
    //return odd.next
    return odd.next;
  }

  private static Node createSinglyLinkedList(int[] arr) {
    Node head = new Node(arr[0]);
    Node temp = head;
    int i = 1;
    while (i < arr.length) {
      temp.next = new Node(arr[i]);
      i++;
      temp = temp.next;
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


