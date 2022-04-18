package com.pepcoding.sorting;

import java.util.Arrays;

//max element will be pushed at the end in the first iteration
public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = {5, 7, 3, 1, 2};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < arr.length-i; j++) {
        if (isSmaller(arr[j], arr[j + 1])) {
          swap(arr, j, j + 1);
        }
      }
    }
  }

  private static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  private static boolean isSmaller(int a, int b) {
    return a > b;
  }
}
