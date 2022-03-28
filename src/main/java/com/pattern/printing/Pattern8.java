package com.pattern.printing;

public class Pattern8 {
    public static void main(String[] args) {
        //int row = 4;
        printPattern();
    }

    private static void printPattern() {
        int k;
        for (int i = 1; i <= 4; i++) {
            k = 1;
            for (int j = 1; j <= 7; j++) {
                if (j >= (5 - i) && j <= (3 + i)) {
                    System.out.print("" + k);
                    if(j<4) k++;
                    else k--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*


   1
  121
 12321
1234321


i, j
1, 4          j>=4 && j<=4    j>=(5-i) && j<=(3 + i)
2, 345        j>=3 && j<=5
3, 23456
4, 1234567

 */
