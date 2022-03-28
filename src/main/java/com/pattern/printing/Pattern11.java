package com.pattern.printing;

public class Pattern11 {
    public static void main(String[] args) {
        int row = 7;
        printPattern(row);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j>=i && j<=(n+1-i)) {
                    if(i == 1 || j == i || j == (n-i +1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
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
  ***
   *

   i,j
   1,12345  j >=1 && j <=5     j>=i && j<=(n+1-i)
   2,234    j >=2 && j <=4
   3,3      j>=3 && j<= 3


 */

