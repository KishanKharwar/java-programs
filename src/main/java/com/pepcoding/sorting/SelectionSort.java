package com.pepcoding.sorting;

import java.util.Arrays;

// in selection sort smaller element will be pushed at the starting index on every iteration
public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 5, 9, 8, 3, 1, 4};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;

      for (int j = i + 1; j < arr.length; j++) {
        int data = arr[j];
        if (arr[i] > arr[j] && arr[min] > data) {
          min = j;
        }
      }
      swap(arr, min, i);
    }
  }

  private static int[] swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }
}
