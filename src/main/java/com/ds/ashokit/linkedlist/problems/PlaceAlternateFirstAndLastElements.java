package com.ds.ashokit.linkedlist.problems;


/*
i/p : 3 -> 5 -> 8 -> -1 -> 2 -> 9 -> 4
o/p : 3 -> 4 -> 5 -> 9 -> 8 -> 2 -> -1
 */
public class PlaceAlternateFirstAndLastElements {

  private static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {

    PlaceAlternateFirstAndLastElements ll = new PlaceAlternateFirstAndLastElements();
    Node h2 = ll.add(null, 3);
    ll.add(h2, 5);
    ll.add(h2, 8);
    ll.add(h2, -1);
    ll.add(h2, 2);
    ll.add(h2, 9);
    ll.add(h2, 4);
    printLinkedList(h2);

    printAlternate(h2);
  }

  private static void printAlternate(Node h) {
    Node temp = h;
    int midIndex = findMiddle(h);
    System.out.println(midIndex);
    Node rev = reverse(h,midIndex);
    printLinkedList(rev);
    //find middle position
    // reverse the other part of the linked list
    //take one by one from both the linked list

  }

  private static Node reverse(Node h, int pos) {
    Node temp = h;
    Node dummy = null;
    int count = 0;
    while(h!= null){

      if(pos<count){
        Node td = h;
        h.next = null;
        dummy = td;
        h = td;
        dummy = dummy.next;
      }
      count++;
      h = h.next;
    }
    return dummy;
  }

  private static int findMiddle(Node h) {
    Node slow = h;
    Node fast = h;
    int count = -1;
    while (fast.next != null && fast.next.next != null) {
      count++;
      slow = slow.next;
      fast = fast.next;
    }

    return count;
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
