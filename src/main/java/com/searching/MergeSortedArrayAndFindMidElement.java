package com.searching;

public class MergeSortedArrayAndFindMidElement {

  public static void main(String[] args) {
    int[] arr1 = {3, 4, 5, 6, 12, 15, 24};
    int[] arr2 = {-4, -2, 1, 7, 11, 17, 23, 34, 45};

    int midElement = findMidElement(arr1, arr2);
    System.out.println("Mid Element : " + midElement);
  }

  private static int findMidElement(int[] arr1, int[] arr2) {

    int[] arr = mergeArray(arr1, arr2);

    return arr[arr.length / 2];
  }

  private static int[] mergeArray(int[] arr1, int[] arr2) {
    int size = arr1.length + arr2.length;
    int[] result = new int[size];
    int p1 = 0, p2 = 0;
    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] > arr2[j]) {
        result[k] = arr2[j];
        j++;
        k++;
      } else {
        result[k] = arr1[i];
        i++;
        k++;
      }
    }

    while (i < arr1.length) {
      result[k] = arr1[i];
      i++;
      k++;
    }

    while (j < arr2.length) {
      result[k] = arr2[j];
      j++;
      k++;
    }
    printArray(result);
    return result;
  }

  private static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
