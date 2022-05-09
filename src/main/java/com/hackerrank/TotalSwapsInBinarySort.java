package com.hackerrank;

import java.util.Arrays;

public class TotalSwapsInBinarySort {

  public static void main(String[] args) {
    int[] arr = {176, -272, -272, -45, 269, -327, -945, 176};
    int swaps = bubbleSort(arr);
    System.out.println(swaps);
    System.out.println(Arrays.toString(arr));
  }

  private static int bubbleSort(int[] arr) {
    int swap = 0;

    for (int i = 1; i <= arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          swap++;
        }
      }
    }
    return swap;
  }

  private static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
