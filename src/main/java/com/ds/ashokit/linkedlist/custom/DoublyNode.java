package com.ds.ashokit.linkedlist.custom;

public class DoublyNode {

  int data;
  DoublyNode next;
  DoublyNode prev;

  public DoublyNode(int data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Node : " + data;
  }
}
