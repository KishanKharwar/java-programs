package com.leetcode;

public class ImplementationQueueUsingArray {

  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.push(1); // queue is: [1]
    myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    System.out.println(myQueue.peek()); // return 1
    System.out.println(myQueue.pop()); // return 1, queue is [2]
    boolean result = myQueue.empty();
    System.out.println(result);// return false
  }

  static class MyQueue {
    int[] arr;
    int front;
    int rear;
    public MyQueue() {
      arr = new int[10];
      front = -1;
      rear = -1;
    }

    public void push(int x) {
      arr[++rear] = x;
      if(rear == 0){
        front++;
      }
    }

    public int pop() {
      int a = arr[front];
      front++;
      return a;
    }

    public int peek() {

      return arr[front];
    }

    public boolean empty() {
      if((front>rear) || (front == -1 && rear == -1)){
        return true;
      }
      return false;
    }
  }
}
