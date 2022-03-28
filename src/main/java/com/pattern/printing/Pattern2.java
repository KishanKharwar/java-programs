package com.pattern.printing;

public class Pattern2 {
    public static void main(String[] args) {
        int row = 7;
        printPattern(row);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j>= (n + 1 - i)){
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
    **
   ***
  ****
 *****

i, j
1, 5    i>=5
2, 45   i>=4
3, 345  i>=3
4, 2345
5, 12345

 */