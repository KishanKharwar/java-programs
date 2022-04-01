package com.pepcoding.stack;

import java.util.Arrays;
import java.util.Stack;

//https://www.youtube.com/watch?v=Zy9XnXw8E7U&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=6
// find next greater element with O(n) complexity
public class NextGreater {

  public static void main(String[] args) {
    int[] arr = {2,5,9,3,1,12,6,8,7};

    printNextGreater1(arr);
  }

  //1)put last element into the stack and nge for the last element is -1
  //2)iterate from last to first, check if stack.peek() is less than the number in the array then
  // pop the element of the array and insert the current element and make the nge as -1
  //3)if the stack.peek() value is greater than the element in the array then the nge will be peek
  // and insert the array element to the stack
  private static void printNextGreater(int[] arr) {
    int[] nge = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[arr.length-1]);
    nge[arr.length-1] = -1;

    for(int i = arr.length-2;i>=0;i--){
      if(arr[i]<stack.peek()){
        nge[i] = stack.peek();
      }else if(arr[i]>stack.peek()){
        while(!stack.isEmpty() && arr[i]>=stack.peek()){
          stack.pop();
        }
        if(stack.isEmpty()){
          nge[i] = -1;
        }else{
          nge[i] = stack.peek();
        }
      }
      stack.push(arr[i]);
    }

    for(Integer i : nge){
      System.out.print(i + " ");
    }

  }

  //by pepcoding
  private static void printNextGreater1(int[] arr) {
    int[] nge = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[arr.length-1]);
    nge[arr.length-1] = -1;

    for(int i = arr.length-2;i>=0;i--){
      while(!stack.isEmpty() && arr[i]>=stack.peek()){
        stack.pop();
      }
      if(stack.isEmpty()){
        nge[i] = -1;
      }else{
        nge[i] = stack.peek();
      }
      stack.push(arr[i]);
    }

    for(Integer i : nge){
      System.out.print(i + " ");
    }

  }
}
