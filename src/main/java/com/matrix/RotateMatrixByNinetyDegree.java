package com.matrix;

public class RotateMatrixByNinetyDegree {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    printArray(arr);
    System.out.println("--------------");
    printRotatedMatrix(arr);
    System.out.println("--------------");
    //rotating integer array
    rotateMatrixWithoutExtraSpace(arr);
    printArray(arr);

    System.out.println("--------------");
    //taking character array
    char[][] arra = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'},
        {'m', 'n', 'o', 'p'}};
    printArray(arra);
    System.out.println("--------------");
    // rotating character array
    rotateMatrixWithoutExtraSpace(arra);
    printArray(arra);
  }


  private static void printRotatedMatrix(int[][] arr) {
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = arr.length - 1; j >= 0; j--) {//row
        System.out.print(arr[j][i] + " ");
      }
      System.out.println();
    }
  }

  private static void rotateMatrixWithoutExtraSpace(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr.length - j - 1];
        arr[i][arr.length - j - 1] = temp;
      }
    }
  }

  private static void rotateMatrixWithoutExtraSpace(char[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        char temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length / 2; j++) {
        char temp = arr[i][j];
        arr[i][j] = arr[i][arr.length - j - 1];
        arr[i][arr.length - j - 1] = temp;
      }
    }
  }

  private static void transpose(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }


  private static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = 0; j < arr.length; j++) {//row
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void printArray(char[][] arr) {
    for (int i = 0; i < arr.length; i++) { //col
      for (int j = 0; j < arr.length; j++) {//row
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
