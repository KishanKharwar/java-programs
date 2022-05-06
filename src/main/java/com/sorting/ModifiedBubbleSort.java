package com.sorting;

public class ModifiedBubbleSort {

  public static void main(String[] args) {
    int[] arr = {9, 5, 7, 2, 8};
    bubbleSort(arr);
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for (Integer i : arr) {
      System.out.print(i + " ");
    }
  }
}
