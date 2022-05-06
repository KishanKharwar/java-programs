package com.pattern.printing;

public class Pattern4 {

  public static void main(String[] args) {
    int row = 7;
    printPattern(row);
  }

  private static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

/*

*****
 ****
  ***
   **
    *

i, j
1, 12345 j>=1
2, 2345 j>=2
3, 345 j >=3
4, 45
5, 5

 */
