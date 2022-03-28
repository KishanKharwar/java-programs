package com.ds.single.linked.list;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(){

    }

    public void insert(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        Node currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(node);
    }

    public void insertHead(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        node.setNext(head);
        head = node;

    }

    public void insertAt(int index, int data){
        Node node = new Node(data);

        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.getNext();
        }
        node.setNext(currentNode.getNext());
        currentNode.setNext(node);
    }

    public void deleteAt(int index){
        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
    }

    public void display(){
       if(head != null){
           Node node = head;
           while(node.getNext()!=null){
               System.out.println(node.getData());
               node = node.getNext();
           }
           System.out.println(node.getData());
       }
    }
}
