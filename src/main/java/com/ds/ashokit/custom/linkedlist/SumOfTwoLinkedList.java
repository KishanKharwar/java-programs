package com.ds.ashokit.custom.linkedlist;

public class SumOfTwoLinkedList {

  public static void main(String[] args) {
    int[] arr1 = {9, 9, 9};
    int[] arr2 = { 1};

    Node h1 = createSinglyLinkedList(arr1);
    printLinkedList(h1);
    Node h2 = createSinglyLinkedList(arr2);
    printLinkedList(h2);

    Node result = sumTwoLinkedList(h1, h2);
    printLinkedList(result);
  }

  private static Node sumTwoLinkedList(Node h1, Node h2) {

    Node revH1 = reverse(h1);
    Node revH2 = reverse(h2);
    Node result = new Node(0);
    Node tempR = result;
    int carry = 0;
    int rem = 0;
    while (revH1 != null && revH2 != null) {
      int sum = revH1.data + revH2.data + carry;
      rem = sum % 10;
      carry = sum / 10;
      result.next = new Node(rem);
      revH1 = revH1.next;
      revH2 = revH2.next;
      result = result.next;
    }

    while(revH1!= null){
      int sum = carry + revH1.data;
      rem = sum % 10;
      carry = sum / 10;
      result.next = new Node(rem);
      revH1 = revH1.next;
      if(revH1 == null && carry == 1){
        result = result.next;
        result.next = new Node(carry);
      }
      result = result.next;
    }

    while(revH2!= null){
      int sum = carry + revH2.data;
      rem = sum % 10;
      carry = sum / 10;
      result.next = new Node(rem);
      revH2 = revH2.next;
      if(revH2 == null && carry == 1){
        result.next = new Node(carry);
      }
      result = result.next;
    }

    Node res = reverse(tempR.next);
    return res;
  }

  public static Node reverse(Node head) {
    if (head == null || head.next == null){
      return head;
    }
    Node rev = reverse(head.next);
    head.next.next = head;
    head.next = null;

    return rev;
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
