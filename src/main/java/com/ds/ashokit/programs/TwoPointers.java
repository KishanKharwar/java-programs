package com.ds.ashokit.programs;

public class TwoPointers {

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    int k = 14;
    boolean result = checkPairContainsSpecificNumber(arr, k);
    System.out.println(result);
  }

  private static boolean checkPairContainsSpecificNumber(int[] arr, int k) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      if (arr[left] + arr[right] == k) {
        return true;
      } else if (arr[left] + arr[right] > k) {
        right--;
      } else {
        left++;
      }
    }
    return false;
  }
}
