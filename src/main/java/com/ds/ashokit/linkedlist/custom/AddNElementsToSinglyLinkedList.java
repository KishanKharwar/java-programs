package com.ds.ashokit.linkedlist.custom;

public class AddNElementsToSinglyLinkedList {

  private static int size = 0;

  public static void main(String[] args) {
    Node h = addNElements(10);

    //Node node = insertAt(h,30,3);
    deleteAt(h,3);
    printLL(h);
    //System.out.println("Size : "+size);
    //printRecursively(h);
  }

  private static Node addNElements(int n) {
    Node head = new Node(1);
    Node temp = head;
    size++;
    //System.out.println("Adding " + head);
    for (int i = 2; i <= n; i++) {
      Node node = new Node(i);
      head.next = node;

      head = head.next;
      size++;
     // System.out.println("Adding " + node);
    }
    return temp;
  }

  private static void printLL(Node h) {
    Node temp = h;
    System.out.print(temp.data);
    while (temp.next!= null){
      temp = temp.next;
      System.out.print( " -> " +temp.data);
    }
    System.out.println();
  }

  private static int size(){
    return size;
  }


  private static void printRecursively(Node h){
    if(h.next == null){
      System.out.println(h.data);
      return;
    }
    printRecursively(h.next);
    System.out.println(h.data);
  }

  private static Node insertAt(Node h, int data, int pos){
    Node temp = h;
    int count = 0;

    while(temp.next!=null){

      if(count == (pos -1)){
        Node node = new Node(data);
        Node temp1 = temp.next;
        temp.next = node;
        node.next = temp1;
      }
      temp = temp.next;
      count++;
    }
    return temp;
  }

  private static Node deleteAt(Node h, int pos){
    Node temp = h;
    int count = 0;

    while(temp.next!= null){

      if(count == (pos-1)){
        temp.next= temp.next.next;
      }
      count++;
      temp = temp.next;
    }

    return temp;
  }

  // 1->1->3->3->7->7->8->8-> : delete 3, then 1->1->7->7->8->8->
  private static Node deleteAllTheOccurances(Node h, int data){
    Node temp = h;

    while (temp.next!= null){
      if(temp.data == data){
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
    return temp;
  }


}
