package com.test.mohit.axyya;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElementInArray {

  public static void main(String[] args) {
    int[] arr = {5,3,1,9,7,3,4,1};
    // -1 -1 -1 1 1 1 3 1

    prevSmaller(arr);
  }

  private static void prevSmaller(int[] arr) {

    int[] res = new int[arr.length];
    res[0] = -1;
    Stack<Integer> stack = new Stack<>();
    for(int i = 1;i<arr.length;i++){
      while(!stack.isEmpty() && stack.peek()>arr[i]){
        stack.pop();
      }
      if(stack.isEmpty()){
        res[i] = -1;
      }else{
        res[i] = stack.peek();
      }
      stack.push(arr[i]);
    }

    System.out.println(Arrays.toString(res));
  }
}
