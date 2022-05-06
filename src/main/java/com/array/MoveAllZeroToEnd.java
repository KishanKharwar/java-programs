package com.array;

public class MoveAllZeroToEnd {

  public static void main(String[] args) {
    int[] arr = {0, 0, 1, 0, 3, 0, 5, 0, 6};
    moveZeros(arr);
  }

  private static void moveZeros(int[] arr) {
    int[] finalArr = new int[arr.length];
    int k = arr.length - 1, j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        finalArr[k--] = arr[i];
      } else {
        finalArr[j++] = arr[i];
      }
    }

    for (int a : finalArr) {
      System.out.print(a + " ");
    }
  }
}
