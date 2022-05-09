package com.hackerrank;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

  public static void main(String[] args) {

    int[] arr = {2, 19, 8, 15, 4};
    reverseArray(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void reverseArray(int[] arr) {
    reverseArray(arr, 0, arr.length - 1);

  }

  private static void reverseArray(int[] arr, int s, int e) {

    if (s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
      reverseArray(arr, ++s, --e);
    }
  }
}
