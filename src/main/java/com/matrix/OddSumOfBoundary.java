package com.matrix;

public class OddSumOfBoundary {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printArray(arr,4,4);

        findOddSumOfBoundary(arr,4);

    }

    private static void findOddSumOfBoundary(int[][] arr, int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    if(arr[i][j] % 2 != 0){
                        sum+= arr[i][j];
                    }
                }
            }
        }
        System.out.println(sum);
    }

    private static void printArray(int[][] arr,int m, int n) {
        for(int i=0;i<m;i++){ //col
            for(int j=0;j<n;j++){//row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
