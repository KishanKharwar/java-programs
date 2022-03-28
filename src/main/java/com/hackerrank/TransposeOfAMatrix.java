package com.hackerrank;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = {{15,-10},{19,8}};
        printMatrics(arr,2,2);
        System.out.println("--------------------");
        transpose(arr,2,2);
    }

    private static void transpose(int[][] arr,int m, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
               int temp = arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i] = temp;
            }

        }
        printMatrics(arr,2,2);
    }

    private static void printMatrics(int[][] arr,int m, int n){
        for(int i=0;i<m;i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
