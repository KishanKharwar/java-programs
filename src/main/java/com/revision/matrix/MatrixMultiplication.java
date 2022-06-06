package com.revision.matrix;

public class MatrixMultiplication {

  public static void main(String[] args) {
    int[][] one = {
        {11, 12, 13},
        {21, 22, 23}
    };

    int[][] two = {
        {11, 12, 13, 14},
        {21, 22, 23, 24},
        {31, 32, 33, 34}
    };

    printMatrixMultiplication(one, two);

  }

  private static void printMatrixMultiplication(int[][] one, int[][] two) {
    int r1 = one.length;
    int c1 = one[0].length;
    int r2 = two.length;
    int c2 = two[0].length;

    if (c1 != r2) {
      System.out.println("Invalid Input");
      return;
    }

    int[][] res = new int[r1][c2];

    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        for (int k = 0; k < c1; k++) {
          res[i][j] += one[i][k] * two[k][j];
        }
      }
    }

    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println("");
    }
  }


}
