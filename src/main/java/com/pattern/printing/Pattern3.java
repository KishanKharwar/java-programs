package com.pattern.printing;

public class Pattern3 {
    public static void main(String[] args) {
        int row = 7;
        printPattern(row);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=(n + 1 -i)){
                    System.out.print("*");
                }else{
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
 1, 12345 j<=5
 2, 1234  j<=4
 3, 123   j<=3
 4, 12
 5, 1

 */