package com.ds.ashokit;

import java.util.Arrays;
import java.util.Stack;

public class AreaOfHistogramOptimized {

  public static void main(String[] args) {
    int[] arr = {2, 1, 5, 4, 7, 6, 2, 3, 10, 8, 5, 6, 4, 7, 2, 3};

    int maxArea = findMaxAreaInHistogram(arr);
    System.out.println(maxArea);
  }

  private static int findMaxAreaInHistogram(int[] arr) {
    int maxArea = arr[0];

    int[] lb = new int[arr.length];
    Arrays.fill(lb, -1);
    Stack<Integer> stLb = new Stack<>();
    stLb.push(0);
    lb[0] = 0;
    for (int i = 1; i < arr.length; i++) {
      while (!stLb.isEmpty() && arr[i] < arr[stLb.peek()]) {
        stLb.pop();
      }
      lb[i] = stLb.peek();
      stLb.push(i);
    }

    int[] rb = new int[arr.length];
    Stack<Integer> stRb = new Stack<>();
    stRb.push(arr.length-1);
    rb[arr.length-1] = arr.length-1;
    for (int i = arr.length-2; i >= 0; i--) {
      while (!stLb.isEmpty() && arr[i] < arr[stLb.peek()]) {
        stRb.pop();
      }
      rb[i] = stRb.peek();
      stRb.push(i);
    }
    for (int i = 0; i < arr.length; i++) {
      int len = rb[i] - lb[i] - 1;
      maxArea = Math.max(maxArea, len * arr[i]);
    }

    return maxArea;
  }
}
