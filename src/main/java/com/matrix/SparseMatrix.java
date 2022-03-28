package com.matrix;

// Sparse matrix is a matrix in which total numbers of 0's is greater or equal to half of size of matrix
//eg, in a 3x4 matrix 0's should be 3x4/2 = 6 i.e., 0's >= 6;
public class SparseMatrix {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,0},{0,1,1,0},{0,0,0,1}};  //arr[3][4]
        printArray(arr,3,4);

        chechSparseMatrix(arr,3,4);
    }

    private static void chechSparseMatrix(int[][] arr, int m, int n) {
        int countZeros = 0;
        int sparseLimit = m * n /2;
        for(int i=0;i<m;i++){ //col
            for(int j=0;j<n;j++){//row
                if(arr[i][j] == 0){
                    countZeros++;
                }
            }
        }
        System.out.println("Total zeros : " + countZeros + " and minimum sparse limit is " + sparseLimit);
        if(countZeros>=sparseLimit){
            System.out.println("Is a sparse matrix" );
        }else{
            System.out.println("Not a sparse matrix");
        }
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
