package com.pattern.printing;

public class Pattern5 {
    public static void main(String[] args) {
        //int row = 4;
        printPattern();
    }

    private static void printPattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if(j>=(5-i) && j<=(3 + i)){
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

   *
  ***
 *****
*******

i, j
1, 4       j>=4 && j<=4   j>=(5-i) && j<=(3 + i)
2, 345     j>=3 && j <= 5
3, 23456   j>=2 && j <=6
4, 1234567

 */