package com.pattern.printing;

public class Pattern6 {

  public static void main(String[] args) {
    //int row = 4;
    printPattern();
  }

  private static void printPattern() {
    boolean k = true;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 9; j++) {
        if (j >= (6 - i) && j <= (4 + i) && k) {
          System.out.print("*");
          k = false;
        } else {
          System.out.print(" ");
          k = true;
        }
      }
      System.out.println();
    }
  }
}

/*

    *
   * *
  * * *
 * * * *
* * * * *
i, j
1, 5     j>=5 && j<=5 && k   j>=(6-i) && j<=(4 + i)
2, 46     j>=4 && j <= 6
3, 357   j>=2 && j <=6
4, 2468
5, 13579

 */