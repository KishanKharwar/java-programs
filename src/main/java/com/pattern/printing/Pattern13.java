package com.pattern.printing;

/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class Pattern13 {

  public static void main(String[] args) {
    int n = 5;
    printPattern(n);
  }

  private static void printPattern(int n) {
    int rowCount = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == 1) {
          System.out.print(i + " ");
        } else {
          System.out.print((n + i) + " ");
        }
      }
      System.out.println(++i + " ");
    }
  }
}
