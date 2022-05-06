package com.matrix;

//https://www.youtube.com/watch?v=SVFXEqn3Ceo
public class SpiralRotationOfMatrix {

  public static void main(String[] args) {
    int[][] arr = {{11, 12, 13, 14, 15, 16, 17},
        {21, 22, 23, 24, 25, 26, 27},
        {31, 32, 33, 34, 35, 36, 37},
        {41, 42, 43, 44, 45, 46, 47},
        {51, 52, 53, 54, 55, 56, 57}};

    spiralRotation(arr);
  }

  private static void spiralRotation(int[][] arr) {
    int minr = 0;
    int maxr = arr.length - 1;
    int minc = 0;
    int maxc = arr[0].length - 1;
    int totalNoOfElement = arr.length * arr[0].length;
    int c = 0;

    while (c < totalNoOfElement) {
      //left corner  col same row from min to max
      for (int i = minr, j = minc; i <= maxr && c < totalNoOfElement; i++) {
        System.out.print(arr[i][j] + " ");
        c++;
      }
      minc++;
      // bottom corner col from min to max row to maxr
      for (int i = maxr, j = minc; j <= maxc && c < totalNoOfElement; j++) {
        System.out.print(arr[i][j] + " ");
        c++;
      }
      maxr--;
      //right corner col = maxc, row = maxr to minr
      for (int i = maxr, j = maxc; i >= minr && c < totalNoOfElement; i--) {
        System.out.print(arr[i][j] + " ");
        c++;
      }
      maxc--;
      //top corner row=minr , col = maxc to minc
      for (int i = minr, j = maxc; j >= minc && c < totalNoOfElement; j--) {
        System.out.print(arr[i][j] + " ");
        c++;
      }
      minr++;
    }
    // System.out.println(c);
  }


}
