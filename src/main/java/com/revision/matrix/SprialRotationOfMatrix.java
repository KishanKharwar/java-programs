package com.revision.matrix;

public class SprialRotationOfMatrix {

  public static void main(String[] args) {
    int[][] arr = {
        {11, 12, 13, 14},
        {21, 22, 23, 24},
        {31, 32, 33, 34},
        {41, 42, 43, 44}
    };
    display(arr);
    System.out.println("-------------------------");
    sprialRotation(arr);
  }

  private static void sprialRotation(int[][] arr) {
    for (int j = 0; j < arr[0].length; j++) {
      if (j % 2 == 0) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i][j] + " ");
        }
      } else {
        for (int i = arr.length - 1; i >= 0; i--) {
          System.out.print(arr[i][j] + " ");
        }
      }
      //System.out.println();
    }
  }

  private static void display(int[][] arr) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
