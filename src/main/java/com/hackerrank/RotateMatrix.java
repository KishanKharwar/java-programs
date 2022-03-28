package com.hackerrank;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr =  {{15,0,0},   //15,0,1
                        {0,18,0},   //0,18,2
                        {1,2,2}};   //0,0,2
        int[][] arr1 = {{1,2},
                        {4,3}};
        rotateMatrix(arr1);
    }

    private static void rotateMatrix(int[][] arr) {
        transpose(arr);
        printMatrix(arr);
        int c = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][c-j-1];
                arr[i][c-j-1] = temp;
            }
        }

        printMatrix(arr);

    }

    private static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
    }

    private static void transpose(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
    }
}
