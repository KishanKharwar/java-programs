package com.hackerrank;

public class PrintDiagonalsOfMatrix {

  public static void main(String[] args) {
    int[][] arr = {{27, 75, 33, 89, 37},  //i=0, j=0,4
        {35, 69, 60, 62, 50}, // i=1, j 1,3
        {84, 18, 80, 56, 28}, // i=2,j=2
        {6, 76, 52, 74, 74},  //i=3, j=1,3
        {77, 52, 95, 69, 29}};//i=4, j=0,4
    printDiagonals(arr, arr.length);
  }

  private static void printDiagonals(int[][] arr, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j == i || j == (n - i - 1)) {
          System.out.print(arr[i][j] + " ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }


}
