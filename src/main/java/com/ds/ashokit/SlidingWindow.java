package com.ds.ashokit;

public class SlidingWindow {

  public static void main(String[] args) {
    int[] arr = {10, 15, 13, 18, 25, 12, 7, 3, 5, 1, 4, -6, 2};
    int k = 4;

    getMaxInWindow(arr, k);
  }

  private static void getMaxInWindow(int[] arr, int k) {

    for (int i = 0; i < arr.length - k + 1; i++) {
      int max = arr[i];

      for (int j = i; j < i + k; j++) {
        if (max < arr[j]) {
          max = arr[j];
        }
      }
      System.out.print(max + " ");
    }
  }
}
