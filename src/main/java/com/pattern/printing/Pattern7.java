package com.pattern.printing;

public class Pattern7 {
    public static void main(String[] args) {
        //int row = 4;
        printPattern();
    }

    private static void printPattern() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= (6 - i) || j >= (4 + i)) {
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

*********
**** ****
***   ***
**     **
*       *

i, j
1, 123456789    j<=5, j>=5   j<=(6-i) && j>=(4+i)
2, 1234 6789    j<=4, j>=6
3, 123   789    j<=3, j>=7
4, 12     89
5, 1       9

 */