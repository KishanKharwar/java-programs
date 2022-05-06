package com.ds.ashokit.programs;

public class TestMergeSort {

  public static void main(String[] args) {
    int arr[] = new int[]{3, 10, 8, 2, 7, -5, 15, 8, 1, 12};
    // find the array with values smaller to the right
    mergeSort(arr, 0, arr.length - 1);
  }

  private static void mergeSort(int[] arr, int i, int j) {
    if (i == j) {
      int[] ba = new int[1];
      ba[0] = arr[i];
      return;
    }
    int mid = (i + j) / 2;
    mergeSort(arr, i, mid);
    mergeSort(arr, mid + 1, j);
    merge(arr, 0, arr.length);
  }


  static void merge(int a[], int low, int high) {

    int mid = (low + high) / 2;
    int temp[] = new int[a.length];
    int p1 = 0, p2 = mid + 1, k = 0;

    while (p1 <= mid && p2 < a.length) {
      if (a[p1] < a[p2]) {
        temp[k] = a[p1];
        p1++;
        k++;
      } else {
        temp[k] = a[p2];
        k++;
        p2++;
      }
    }

    while (p1 <= mid) {
      temp[k++] = a[p1++];
    }

    while (p2 < high) {
      temp[k++] = a[p2++];
    }

    for (int i = 0; i < high; i++) {
      a[i] = temp[i];
    }

    for (int i = 0; i < high; i++) {
      System.out.print(a[i] + ",");
    }

  }
}
