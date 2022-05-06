package com.matrix;

public class BinarySearchInMatrix {

  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
    int num = 10;
    search(arr, num);
  }

  private static void search(int[][] arr, int num) {

    int count = 0;
    int minr = 0;
    int minc = 0;
    int maxr = arr.length - 1;
    int maxc = arr[0].length - 1;

    while (minr <= maxr && minc <= maxc) {

      if (arr[minr][maxc] == num) {
        System.out.println("Coordinate is : (" + minr + "," + maxc + ")");
        //count++;
        break;
      } else if (num > arr[minr][maxc]) {
        minr++;
        count++;
      } else if (num < arr[minr][maxc]) {
        maxc--;
        count++;
      }
    }
    System.out.println("No of operations : " + count);
  }
}
