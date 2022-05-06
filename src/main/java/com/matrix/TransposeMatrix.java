package com.matrix;

//row should be interchanged with columns is a transpose matrix
public class TransposeMatrix {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    printArray(arr);
    //System.out.println("--------------");
    // transpose(arr);
    System.out.println("--------------");
    transposeWithoutExtraSpace(arr);
    printArray(arr);
  }

  private static void transposeWithoutExtraSpace(int[][] arr) {
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = i; j < arr.length; j++) {//row  01,10, 00
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
        // System.out.print(arr[j][i] + " ");
      }
      //  System.out.println();
    }
  }

  private static void transpose(int[][] arr) {
    int[][] t = new int[arr.length][arr.length];
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = 0; j < arr.length; j++) {//row
        t[i][j] = arr[j][i];
      }
    }
    printArray(t);
  }

  private static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = 0; j < arr.length; j++) {//row
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
