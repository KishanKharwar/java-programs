package com.ds.ashokit.linkedlist;

public class CustomLinkedList {

  static class Node {
    int data;
    Node next;

    public Node(int data){
      this.data = data;
    }
  }

  private Node head;
  private int size;

  public static void main(String[] args) {
    //adding n elements to Linked List and printing those
//    int n = 10;
//    Node h = addNElements(n);
//    printLinkedList(h);

    // adding one one element to linked list at last
//    CustomLinkedList linkedList = new CustomLinkedList();
//    linkedList.add(10);
//    linkedList.add(20);
//    linkedList.add(30);
//    printLinkedList(linkedList.head);


    //insert at first index in Linked List
//    CustomLinkedList linkedList = new CustomLinkedList();
//    linkedList.add(10);
//    linkedList.add(20);
//    linkedList.add(30);
//    Node h = linkedList.addFirst(5);
//    printLinkedList(linkedList.head);

    //Delete from specific position
//    CustomLinkedList linkedList = new CustomLinkedList();
//    linkedList.add(10);
//    linkedList.add(20);
//    linkedList.add(30);
//    linkedList.delete(2);
//    printLinkedList(linkedList.head);

    //Printing LinkedList in reverseOrder and implementing size() method
//    CustomLinkedList linkedList = new CustomLinkedList();
//    linkedList.add(10);
//    linkedList.add(20);
//    linkedList.add(30);
//    linkedList.printInReverseOrderUsingResursion(linkedList.head);
//    System.out.println(" Size : " + linkedList.size());

      //reversing linkedlist
    CustomLinkedList linkedList = new CustomLinkedList();
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.reverseLinkedList();
    printLinkedList(linkedList.head);
  }

  private Node reverseLinkedList(){
    Node curr = head;
    Node prev = null;

    while(curr != null){
      Node temp = curr.next;
      curr.next = prev;

      prev = curr;
      curr = temp;
    }

    return prev;
  }

  private Node getNodeAt(int pos){
    Node temp = head;

    for(int i = 0;i<pos;i++){
      temp = temp.next;
    }
    return temp;
  }

  private int size(){
    int count = 0;
    if(head == null){
      return count;
    }

    while(head != null){
      count++;
      head = head.next;
    }
    return count;
  }

  private void printInReverseOrderUsingResursion(Node h){
    if(h == null){
      return;
    }

    printInReverseOrderUsingResursion(h.next);
    System.out.print(h.data + "->");
  }

  private void delete(int pos){
    Node temp = head;
    int count = 0;
    while(temp.next!= null){
      if((pos - 1) == count){
          temp.next = temp.next.next;
      }else{
        temp = temp.next;
      }
      count++;
    }

  }

  private Node addFirst(int data){
    Node temp = head;
    Node node = new Node(data);
    if(head == null){
      temp = head = node;
    }

    node.next = temp;
    temp = head = node;

    return temp;
  }


  private Node add(int data){
    Node temp =  head;
    Node node = new Node(data);

    if(head == null){
      temp = head = node;

      return temp;
    }

    while(temp.next != null){
      temp = temp.next;
    }

    temp.next = node;

    return temp;
  }

  private static Node addNElements(int n){
    Node head = new Node(1);
    Node temp = head;

    for(int i = 2;i<=n;i++){
      Node node = new Node(i);
      head.next = node;
      head = head.next;
    }

    return temp;
  }

  private static void printLinkedList(Node h){
    if(h == null){
      return ;
    }

    while(h!= null){
      System.out.print(h.data + "->");
      h = h.next;
    }
  }

//  private void reverseLinkedListData(Node h, int size){
//    int li = 0;
//    int ri = size -1;
//
//    while(li<ri){
//      Node ln = getNodeAt(li);
//      Node rn = getNodeAt(ri);
//
//      int temp = ln.data;
//      ln.data = rn.data;
//      rn.data = temp;
//      li++;
//      ri--;
//    }
//
//  }
}
