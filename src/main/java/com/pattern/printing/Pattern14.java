package com.pattern.printing;

/*

 *
 * *
 * * *
 * *
 *

 */
public class Pattern14 {

  public static void main(String[] args) {
    int n = 4;
    printPattern(n);
  }

  private static void printPattern(int n) {
    int count = 0;
    if (n % 2 == 0) {
      count = 3;
    } else {
      count = 2;
    }
    int k = 0;
    for (int i = 1; i <= n + count; i++) {
      k = (i <= n) ? ++k : --k;
      for (int j = 1; j <= (2*n -1); j++) {
        if (j <= k) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
