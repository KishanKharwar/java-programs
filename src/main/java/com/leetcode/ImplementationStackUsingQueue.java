package com.leetcode;

import java.util.Queue;

public class ImplementationStackUsingQueue {

  public static void main(String[] args) {
    MyStack myStack = new MyStack();
    myStack.push(1);
    myStack.push(2);
    myStack.top(); // return 2
    myStack.pop(); // return 2
    myStack.empty(); // return False
  }

  static class MyStack{
   
    public MyStack() {

    }

    public void push(int x) {

    }

    public int pop() {
      return 0;
    }

    public int top() {
      return 0;
    }

    public boolean empty() {
      return false;
    }
  }
}
