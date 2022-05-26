package com.hackerrank;


public class CycleDetectionLinkedList {

  public static void main(String[] args) {

    int[] arr1 = {1, 2, 3};
    int[] arr2 = {1, 2, 3, 1};

    Node head1 = convertIntoList(arr1);
    printLL(head1);
    Node head2 = convertIntoList(arr2);
    printLL(head2);

    boolean result1 = hasCycle(head1);
    boolean result2 = hasCycle(head2);
    System.out.println(result1);
    System.out.println(result2);
  }

  static boolean hasCycle(Node head) {

    if (head == null) {
      return false;
    }

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }

    return false;
  }

//  public static boolean hasCycle(Node head) {
//    //take head data store soe where
//
//    Node temp = head, temp1 = head;
//    boolean result = false;
//
//    while(temp != null){
//      int data = temp.data;
//      while(temp1 != null && temp1.next != null){
//        if(data == temp1.next.data){
//          result = true;
//          break;
//        }
//        temp1 = temp1.next;
//      }
//
//      if (result){
//        return result;
//      }
//      temp = temp.next;
//      temp1=temp;
//    }
//
//    return result;
//  }

  private static Node convertIntoList(int[] arr) {
    if (arr.length <= 0) {
      return null;
    }
    Node h = new Node(arr[0]);
    Node temp = h;

    for (int i = 1; i < arr.length; i++) {
      h.next = new Node(arr[i]);
      h = h.next;
    }

    return temp;
  }


  private static void printLL(Node h) {
    while (h != null) {
      System.out.print(h.data + " ");
      h = h.next;
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
