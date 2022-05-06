package com.array;

import java.util.Arrays;

public class SumOfPairIsTarget {

  public static void main(String[] args) {
    int[] arr = {2, 7, 4, -5, 11, 5, 20};
    int sum = 15;

    //findPairs(arr,sum);
    findPairsUsingTwoPointer(arr, sum);
  }

  private static void findPairsUsingTwoPointer(int[] arr, int sum) {
    Arrays.sort(arr);
    int first = 0, last = arr.length - 1;

    while (first < last) {
      if (arr[first] + arr[last] == sum) {
        System.out.println(arr[first] + " + " + arr[last] + " = " + sum);
        first = first + 1;
        last = last - 1;
      } else if (arr[first] + arr[last] > sum) {
        last = last - 1;
      } else if (arr[first] + arr[last] < sum) {
        first = first + 1;
      }
    }

  }

  private static void findPairs(int[] arr, int sum) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if ((arr[i] + arr[j]) == sum) {
          System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
        }
      }
    }
  }
}
