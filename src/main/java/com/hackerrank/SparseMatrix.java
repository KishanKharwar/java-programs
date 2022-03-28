package com.hackerrank;

// A matrix containing 0 value in more than half of its elements, then it is called a sparse matrix.
public class SparseMatrix {
    public static void main(String[] args) {
        int[][] arr = {{15,0,0},{0,18,0},{1,2,2}};
        checkSparseMatrix(arr);
    }

    private static void checkSparseMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int halfElement = row * col /2;
        int countZero = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j] == 0){
                    countZero++;
                }
            }
        }
        if(countZero>halfElement){
            System.out.println("Sparse Matrix");
        }
    }
}
