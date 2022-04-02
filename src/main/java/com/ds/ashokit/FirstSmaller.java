package com.ds.ashokit;


import java.util.Arrays;
import java.util.Stack;

/**
 * Find the first smaller from the left, if doesn't have smaller then print -1
 * @input int[] arr = {10,3,15,25,9,12,17,2,5,9,4,8};
 * @output 3 2 9 9 2 2 2 -1 4 4 -1 -1
 */
public class FirstSmaller {

  public static void main(String[] args) {
    int[] arr = {10,3,15,25,9,12,17,2,5,9,4,8};
    findFirstSmaller(arr,arr.length);
  }

  public static void findFirstSmaller(int[] arr, int n){
    Stack<Integer> stack = new Stack<Integer>();
    int[] fse = new int[n];
    stack.push(arr[n-1]);
    fse[n-1] = -1;

    for(int i = n-2; i>=0;i--){
      while(!stack.isEmpty() && arr[i]<stack.peek()){
        stack.pop();
      }

      if(stack.isEmpty()){
        fse[i] = -1;
      }else{
        fse[i] = stack.peek();
      }

      stack.push(arr[i]);
    }

    System.out.println(Arrays.toString(fse));
  }
}
