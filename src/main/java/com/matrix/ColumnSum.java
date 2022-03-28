package com.matrix;

public class ColumnSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        printArray(arr);
        int len = arr.length;
        colSum(arr, len);
    }
    private static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){ //col
            for(int j=0;j<arr.length;j++){//row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void colSum(int[][] arr, int len) {
        for(int i=0;i<len;i++){ //col
            int sum = 0;
            for(int j=0;j<len;j++){//row // 0,0 1,0 2,0 j,i
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}
