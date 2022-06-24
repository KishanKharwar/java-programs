package com.pepcoding.revision;

// if index not found then return -1
public class FirstIndexOfOccurance11 {

  public static void main(String[] args) {
    int[] arr = {2, 3, 9, 8, 7, 6, 4, 12, 7, 3, 8};
    int data = 8;
    int idx = 0;
    int resIdx = fio(arr, idx, data);
    System.out.println(resIdx);
  }

  private static int fio(int[] arr, int idx, int data) {
    if (idx == arr.length) {
      return -1;
    }

    if (arr[idx] == data) {
      return idx;
    } else {
      int iisa = fio(arr, idx + 1, data);
      return iisa;
    }
  }
}
