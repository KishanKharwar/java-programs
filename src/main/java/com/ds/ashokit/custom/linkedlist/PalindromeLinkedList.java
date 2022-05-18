package com.ds.ashokit.custom.linkedlist;


public class PalindromeLinkedList {

  public static void main(String[] args) {
    int[] arr = {3, 5, 8, 5, 3};
    Node head = createSinglyLinkedList(arr);
    printLinkedList(head);

    boolean result = checkPalindrome(head);
    System.out.println(result);
  }

  private static boolean checkPalindrome(Node head) {
    boolean result = true;

    //Node temp = head;
    Node mid = findMid(head);
    Node nHead = mid.next;
    mid.next = null;
    Node reversed = reverseLinkedList(nHead);
    printLinkedList(reversed);
    while(head!= null && head.next != null && reversed != null && reversed.next != null){
      if(head.data == reversed.data){
        head = head.next;
        reversed = reversed.next;
        continue;
      }else{
        result = false;
        break;
      }
    }

    return result;
  }

  private static Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private static Node reverseLinkedList(Node head) {
    if(head == null || head.next == null){
      return head;
    }

    Node reversed = reverseLinkedList(head.next);
    head.next.next = head;

    head.next = null;

    return reversed;
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
