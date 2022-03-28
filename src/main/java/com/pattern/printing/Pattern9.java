package com.pattern.printing;

//hollow rectangle
public class Pattern9 {
    public static void main(String[] args) {
        int row = 7;
        printPattern(row);
    }

    private static void printPattern(int n) {
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                if(i == 1 || i == (n) || j == 1|| j == (n)){
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
 ***************
 *             *
 *             *
 *             *
 *             *
 *             *
 *             *
 ***************




 */
