package com.matrix;

public class SumTwoMatrix {

  public static void main(String[] args) {
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arr2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    printArray(arr1);
    System.out.println("--------------");
    printArray(arr2);
    System.out.println("--------------");

    sumTwoMatrics(arr1, arr2);
  }

  private static void sumTwoMatrics(int[][] arr1, int[][] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1.length; j++) {
        int sum = arr1[i][j] + arr2[i][j];
        System.out.print(sum + " ");
      }
      System.out.println();
    }
  }

  private static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = 0; j < arr.length; j++) {//row
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
