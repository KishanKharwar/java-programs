package com.ds.ashokit.programs;

public class FindPairsWithCondition {

  public static void main(String[] args) {
    int[] arr = {3, 10, 8, 2, 7, -5, 15, 8, 1, 12};

    int max = checkPairs(arr);
    System.out.println(max);
  }

  private static int checkPairs(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          count++;
        }
      }
    }
    return count;
  }
}
