package com.hackerrank;

public class MatrixAddition8 {
    public static void main(String[] args) {
        int[][] arr1 = {{5,-1,3},{19,8,4}};
        int[][] arr2 = {{4,5,-6},{1,-2,12}};

        sum(arr1,arr2,3,2);
    }

    private static void sum(int[][] arr1, int[][] arr2,int n, int m) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j] + arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
