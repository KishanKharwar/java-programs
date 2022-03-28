package com.hackerrank;

public class ColumnWiseSumOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{15,-11},{5,2}};
        columnWiseSum(arr,2,2);
    }

    private static void columnWiseSum(int[][] arr,int m, int n) {
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }

}
