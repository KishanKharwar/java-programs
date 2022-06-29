package com.test.interview;

public class TestingBubbleSort {

  public static void main(String[] args) {
    int[] arr = {2, 7, 3, 1, 5, 2};

    bubbleSort(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }

  }

  private static void bubbleSort(int[] arr, int length) {
    for (int j = 0; j < length; j++) {
      for (int i = 0; i < length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
  }
}
