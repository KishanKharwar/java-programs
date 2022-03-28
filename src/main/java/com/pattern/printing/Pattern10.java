package com.pattern.printing;

public class Pattern10 {
    public static void main(String[] args) {
        int row = 7;
        printPattern(row);
    }

    private static void printPattern(int n) {
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                if(j<=i){
                    if(i == 1 || j == 1 || i == j || i == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
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
 * *
 *  *
 *   *
 *    *
 *     *
 *      *
 *       *
 *        *
 ***********


 */
