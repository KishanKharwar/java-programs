package com.ds.ashokit.recursion;

import java.util.Arrays;

public class BinarySearchUsingRecursion {

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9, 12, 43, 356, 67, 78, 23};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int search = 5;
    int index = binarySearch(arr, 0, arr.length - 1, search);
    System.out.println(index);
  }

  private static int binarySearch(int[] arr, int left, int right, int search) {
    if (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == search) {
        return mid;
      } else if (arr[mid] > search) {
        binarySearch(arr, left, mid, search);
      } else {
        return binarySearch(arr, mid + 1, right, search);
      }
    }
    return -1;
  }
}
