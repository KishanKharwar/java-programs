package com.ds.ashokit.custom.linkedlist;

import java.util.HashSet;

public class SelfLoopInLinkedList {

  public static void main(String[] args) {
    int[] arr = {1,2,3,1};
    Node h = createSinglyLinkedList(arr);
    h.next.next.next.next = h;

    boolean result = findLoop(h);
    System.out.println(result);
//    printLinkedList(h);
    Node newNode = floydCycle(h);
    printLinkedList(newNode);


  }
  
  private static Node floydCycle(Node head){
    Node slow = head;
    Node fast = head;
    Node temp = fast;
    Node prev = fast;
    while(slow!=null && fast != null && fast.next != null){
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;

      if(slow == fast){
        System.out.println("Overlapping : " + slow.data);
        prev.next = null;
        break;
      }
    }
    return temp;
  }

  private static boolean findLoop(Node h){

    HashSet<Node> s = new HashSet<>();
    while(h != null){
      if(s.contains(h)){
        return true;
      }
      s.add(h);
      h = h.next;
    }

    return false;
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

    public Node(int data)
    {
      this.data = data;
    }
  }
}
