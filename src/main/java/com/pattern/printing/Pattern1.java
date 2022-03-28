package com.pattern.printing;

public class Pattern1 {
    public static void main(String[] args) {
        int row = 7;
        printPattern(row);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=i){
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
 1, 1
 2, 12     i<=2
 3, 123    i<=3
 4, 1234
 5, 12345

 */
