package com.array;

public class LongestConsecutiveElementSequence {

  public static void main(String[] args) {
    int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
    int[] arr1 = {49, 50, 51, 200, 2, 4, 70, 5};
    findLongestConsecutiveSequence(arr1);
  }

  private static void findLongestConsecutiveSequence(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      int ans = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] == ans + 1) {
          System.out.println(ans);
          ans = ans + 1;
          continue;
        }
      }
    }
  }
}
