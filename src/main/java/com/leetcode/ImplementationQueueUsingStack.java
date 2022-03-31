package com.leetcode;


import java.util.Stack;

public class ImplementationQueueUsingStack {

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

    Stack<Integer> value = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        if (value.isEmpty()){
          value.push(x);
        }else {
          while(!value.isEmpty()){
            temp.push(value.pop());
          }

          value.push(x);
          while (!temp.isEmpty()){
            value.push(temp.pop());
          }
        }
    }

    public int pop() {
      return value.pop();
    }

    public int peek() {
      return value.peek();
    }

    public boolean empty() {
      return value.isEmpty();
    }
  }
}
