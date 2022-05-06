package com.ds.single.linked.list;

public class Main {

  public static void main(String[] args) {
    CustomLinkedList l = new CustomLinkedList();
    l.insert(5);
    l.insert(10);
    l.insert(15);
    l.insert(20);
    l.display();
    l.insertAt(2, 100);
    System.out.println("*********");
    l.display();
    l.deleteAt(2);
    System.out.println("*********");
    l.display();
    l.insertHead(50);
    System.out.println("*********");
    l.display();

  }
}
