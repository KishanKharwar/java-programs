package com.pepcoding.stack;

import java.util.Stack;

public class NextGreaterAlternate {

  public static void main(String[] args) {
    int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
    printNextGreater1(arr); //5 9 12 12 12 -1 8 -1 -1
  }

  //1)if arr[i] is greater than the element in arr[stack.peek()] then pop the element and make
  // a[i] as next greater element
  //store position in stack
  private static void printNextGreater1(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int[] nge = new int[arr.length];
    stack.push(0);

    for (int i = 1; i < arr.length; i++) {
      while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
        int pos = stack.peek();
        nge[pos] = arr[i];
        stack.pop();
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      nge[stack.peek()] = -1;
      stack.pop();
    }

    for (Integer i : nge) {
      System.out.print(i + " ");
    }
  }
}
