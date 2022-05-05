package com.pattern.printing;

/*
 *****
 *   *
 *   *
 *****
 */
public class Pattern15 {
  public static void main(String[] args) {
    int row = 5;
    int col = 4;
    printPattern(row,col);
  }

  private static void printPattern(int row, int col) {
    for (int i = 1; i <= col; i++) {
      for (int j = 1; j <= row; j++) {
        if (i == 1 || i == col || j == 1 || j == row) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
