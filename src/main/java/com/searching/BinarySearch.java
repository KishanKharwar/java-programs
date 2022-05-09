package com.searching;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = new int[25];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    int findNum = 23;
    boolean found = binarySearch(arr, findNum);
    System.out.println(found);
  }

  private static boolean binarySearch(int[] arr, int findNum) {
    int first = arr[0], last = arr[arr.length - 1], mid = (first + last) / 2;

    while (first <= last) {
      if (mid == findNum) {
        return true;
      }
      if (mid > findNum) {
        last = mid - 1;
      }

      if (mid < findNum) {
        first = mid + 1;
      }

      mid = (first + last) / 2;
    }
    return false;
  }
}
