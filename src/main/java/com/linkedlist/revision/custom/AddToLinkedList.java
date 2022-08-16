package com.linkedlist.revision.custom;


public class AddToLinkedList {

  public static void main(String[] args) {
    Node root = addNElements(10);
    add(root,11);
    printLinkedList(root);
    System.out.println();
    Node newRoot = addFirst(root,116);
    printLinkedList(newRoot);
    System.out.println();
    Node rev = reverse(newRoot);
    printLinkedList(rev);
  }

  private static Node reverse(Node root){
    Node curr = root;
    Node prev = null;
    while(curr != null){
      Node temp = curr.next;
      curr.next = prev;

      prev = curr;
      curr = temp;
    }
    return prev;
  }

  private static int getNodeAt(Node root,int pos){
    if(root == null){
      return Integer.MIN_VALUE;
    }
    for(int i = 0;i<pos;i++){
      root = root.next;
    }

    return root == null ? Integer.MIN_VALUE : root.data;
  }

  private static int size(Node root) {
    int count = 0;
    if(root == null){
      return count;
    }
    while(root != null){
      count++;
      System.out.println(root.data);
      root = root.next;
    }
    return count;
  }

  private static Node addFirst(Node root, int data){
    Node node = new Node(data);

    if(root == null){
      return node;
    }
    Node temp = root;
    node.next = temp;
    return node;
  }

  private static Node delete(Node root, int pos){
    if(pos == 0){
      return root.next;
    }

    Node temp = root;
    int count = 0;
    while(root.next != null){
      if((pos-1) == count){
        root.next = root.next.next;
        return temp;
      }else{
        root = root.next;
      }
      count++;
    }

    return temp;
  }

  private static Node add(Node root, int data){
    Node node = new Node(data);
    if(root == null){
      root = node;
      return root;
    }

    Node temp = root;
    while(root.next != null){
      root = root.next;
    }
    root.next = node;
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

  private static void printLinkedList(Node root){
    if(root == null){
      return;
    }

    System.out.print(root.data + " -> ");
    printLinkedList(root.next);

  }

  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
    }
  }
}
