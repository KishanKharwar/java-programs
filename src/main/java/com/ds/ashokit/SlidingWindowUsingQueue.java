package com.ds.ashokit;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowUsingQueue {

  public static void main(String[] args) {
    int arr[] = {10,15,13,18,25,12,7,3,5,1,4,-6,2};
    int windowSize = 4;
    printMax(arr,windowSize);
  }

  private static void printMax(int[] arr,int k) {
    Deque<Integer> deque = new ArrayDeque();
    int[] maxArr = new int[arr.length - k + 1];
    int maxArrIndex = 0;

    for(int i = 0;i<arr.length;i++){
      if(!deque.isEmpty() && deque.peek() == i-k){
        deque.poll();
      }

      while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i]){
        deque.removeLast();
      }
      deque.offer(i);

      if(i>=k-1){
        maxArr[maxArrIndex++] = arr[deque.peek()];
      }
    }

    System.out.println(Arrays.toString(maxArr));
  }
}
