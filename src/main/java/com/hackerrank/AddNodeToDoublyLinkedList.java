package com.hackerrank;


public class AddNodeToDoublyLinkedList {

  public static void main(String[] args) {
    int[] arr = {2,3,4};
    DoublyLinkedList ll = new DoublyLinkedList();
    for(int i : arr){
      ll.insertNode(i);
    }
    printDoublyLinkedList(ll.head);
    System.out.println();
    DoublyLinkedListNode node = sortedInsert(ll.head,1);
    printDoublyLinkedList(node);
  }

  public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
    DoublyLinkedListNode temp = llist;
    DoublyLinkedListNode node = new DoublyLinkedListNode(data);
    while(llist != null){
      if(data < llist.data){
        if(llist.prev != null){
          DoublyLinkedListNode prevNode = llist.prev;
          prevNode.next = node;
          node.prev = prevNode;
          node.next = llist;
          llist.prev = node;
          break;
        }else{
          llist.prev = node;
          node.next = llist;
          llist = node;
          return llist;

        }
      }else{
        llist.next = node;
        node.prev = llist;
      }
      llist = llist.next;
    }

    return temp;
  }




  static class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
      this.prev = null;
    }
  }

  static class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    public void insertNode(int nodeData) {
      DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

      if (this.head == null) {
        this.head = node;
      } else {
        this.tail.next = node;
        node.prev = this.tail;
      }

      this.tail = node;
    }
  }

  public static void printDoublyLinkedList(DoublyLinkedListNode node) {
    while (node != null) {
      System.out.print(node.data + " ");

      node = node.next;
    }
  }


}
