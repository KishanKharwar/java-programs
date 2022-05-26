package com.hackerrank;

public class PalindromicLinkedList1 {

  public static void main(String[] args) {
    int[] arr = {9, 7, 5, 5, 0, 0, 5, 5, 7, 9};
    Node h = convertIntoList(arr);
    printLL(h);

    Node rev = reverse(h);
    printLL(rev);
    boolean result = checkPalindrome(h);
    System.out.println(result);
  }

  private static boolean checkPalindrome(Node h) {
    boolean result = true;
    //find middle
    Node middle = middleNode(h);
    // reverse middle
    Node reverseSecondHalf = reverse(middle.next);

    // chck both the nodes
    while(h != null && reverseSecondHalf != null){
      if(h.data != reverseSecondHalf.data){
        result = false;
        break;
      }
      h = h.next;
      reverseSecondHalf = reverseSecondHalf.next;
    }
    return result;
  }

  private static Node middleNode(Node h) {
    Node fast = h;
    Node slow = h;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }


  private static Node reverse(Node h) {
    if (h == null || h.next == null) {
      return h;
    }

    Node temp = reverse(h.next);
    h.next.next = h;
    h.next = null;
    return temp;
  }

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
