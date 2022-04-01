package com.pepcoding.stack;

import java.util.Stack;

//https://www.youtube.com/watch?v=0BsPlzqksZQ&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=10
public class StockSpan {

  public static void main(String[] args) {
    int[] arr = {2,5,9,3,1,12,6,8,7};
    stockSpan(arr); //1 2 3 1 1 6 1 2 1
  }
  // stock span means when did the stock price was higher than current value
  // Steps
    // for first element in array, nothing will be higher then will simply return 1;
    // we will maintain the location inside the stack
    // for other elements we will check if arr[i] >= arr[stack.peek()]; then pop all the element
    //  but push the i value
    // at last see if stack size is zero, that means the stock price didnt reached higher.
    // else if stack size is not zero then take the i value and subtract with stack.peek();
  private static void stockSpan(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int[] span = new int[arr.length];

    stack.push(0);
    span[0]=1;

    for(int i =1;i< arr.length;i++){
      while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
        stack.pop();
      }

      if(stack.isEmpty()){
        span[i] = i + 1;
      }else {
        span[i] = i - stack.peek();
      }

      stack.push(i);
    }

    for(Integer i : span){
      System.out.print(i+" ");
    }
  }
}
