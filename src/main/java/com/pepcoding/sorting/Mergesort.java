package com.pepcoding.sorting;

import java.util.Arrays;

public class Mergesort {

  public static void main(String[] args) {
    int[] arr = {7, 2, 5, 9, 8, 3, 1, 4};
    int[] mergedArray = mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(mergedArray));
  }

  private static int[] mergeSort(int[] arr, int i, int j) {
    if (i == j) {
      int[] singleArray = new int[1];
      singleArray[0] = arr[i];
      return singleArray;
    }

    int mid = (i + j) / 2;
    int[] lsh = mergeSort(arr, i, mid);
    int[] rsh = mergeSort(arr, mid + 1, j);
    int[] finalArray = mergeTwoArray(lsh, rsh);

    return finalArray;
  }

  private static int[] mergeTwoArray(int[] lsh, int[] rsh) {
    int[] arr = new int[lsh.length + rsh.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < lsh.length && j < rsh.length) {
      if (lsh[i] > rsh[j]) {
        arr[k] = rsh[j];
        k++;
        j++;
      } else {
        arr[k] = lsh[i];
        k++;
        i++;
      }
    }

    while (i < lsh.length) {
      arr[k] = lsh[i];
      k++;
      i++;
    }

    while (j < rsh.length) {
      arr[k] = rsh[j];
      k++;
      j++;
    }

    return arr;

  }
}
