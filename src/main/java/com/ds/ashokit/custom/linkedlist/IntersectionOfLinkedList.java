package com.ds.ashokit.custom.linkedlist;


public class IntersectionOfLinkedList {

  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6,7,8};
    int[] arr2 = {11,12,13,14,10,20,30,4,5,6,7,8};

    Node a = createSinglyLinkedList(arr1);
    Node b = createSinglyLinkedList(arr2);

    int intersection = getIntersectionNode(a,b);
    System.out.println(intersection);
  }

  public static int getIntersectionNode(Node a, Node b){
    int sizeA = size(a);
    int sizeB = size(b);

    int move = Math.abs(sizeA-sizeB);

    if(sizeA>sizeB){
      for(int i = 0;i<move;i++){
        a = a.next;
      }
    }else if (sizeB>sizeA){
      for(int i = 0;i<move;i++){
        b = b.next;
      }
    }

    while(a.data != b.data){
      a = a.next;
      b = b.next;
    }

    return a.data;
  }

  public static int size(Node node){
    int count = 0;

    while(node != null){
      count++;
      node = node.next;
    }

    return count;
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
    
    public Node(int data){
      this.data = data;
    }
  }
}
