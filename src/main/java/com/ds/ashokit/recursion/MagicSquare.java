package com.ds.ashokit.recursion;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
5 3 4
1 5 8
6 4 2
 */
public class MagicSquare {

  public static void main(String[] args) {
    int[][] mainArray = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
    int[] mArray = Stream.of(mainArray).flatMapToInt(IntStream::of).toArray();
    int n = mArray.length;
    int[] arr = new int[9];
    boolean[] taken = new boolean[10];
    int index = 0;
    permutations(mArray,arr,taken,index,n);

    // int[] finalArray = {8, 4, 3, 6, 2, 7, 1, 9, 5};
    // int cost = findCost(mArray,finalArray);
    // System.out.println(cost);
    // magicSquare(mArray);

  }

  private static void permutations(int[] mainArray, int[] arr, boolean[] taken, int index, int n) {
    int min = Integer.MAX_VALUE;
    if (index == 9) {
      if (magicSquare(arr)) {
        int tempMin = findCost(mainArray,arr);
        if(min>tempMin){
          min = tempMin;
        }
        System.out.println("Min Cost : " + min);
        System.out.println(Arrays.toString(arr));
        return ;
      }
    }

    for (int i = 1; i <= 9; i++) {
      if (taken[i] == false) {
        taken[i] = true;
        arr[index] = i;
        permutations(mainArray, arr, taken, index + 1, n);
        //System.out.println(Arrays.toString(arr));
        taken[i] = false;
      }
    }
  }

  private static int findCost(int[] mainArray, int[] arr) {
    int sum = 0;
    for(int i = 0;i<arr.length;i++){
      sum += Math.abs(mainArray[i] - arr[i]);
    }
    return sum;
  }

  private static boolean magicSquare(int[] arr) {
    int dia = 0;
    int row1 = 0;
    int row2 = 0;
    int row3 = 0;

    int col1 = 0;
    int col2 = 0;
    int col3 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i < 3) {
        row1 = row1 + arr[i];
      }
      if (i >= 3 && i < 6) {
        row2 = row2 + arr[i];
      }
      if (i >= 6 && i <= 8) {
        row3 = row3 + arr[i];
      }

      if (i % 3 == 0) {
        col1 = col1 + arr[i];
      }

      if (i % 3 == 1) {
        col2 = col2 + arr[i];
      }

      if (i % 3 == 2) {
        col3 = col3 + arr[i];
      }

      if (i % 4 == 0) {
        dia = dia + arr[i];

      }
    }

    if (dia == row1 && dia == col1 && row1 == row2 && row2 == row3 && col1 == col2
        && col2 == col3) {
      return true;
    }
    return false;
  }

}
