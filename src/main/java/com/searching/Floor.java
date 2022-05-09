package com.searching;

public class Floor {

  public static void main(String[] args) {
    int[] arr = {3, -7, -2, 15, 18, 12, -5, 20, 10, -13};
    int[] q = {17, 19, 17, -3, 25, -20};
    floor(arr, q);
  }

  private static void floor(int[] arr, int[] q) {
    for (int i = 0; i < q.length; i++) {
      int ans = Integer.MIN_VALUE;
      for (int j = 0; j < arr.length; j++) {
        if (q[i] >= arr[j] && ans < arr[j]) {
          ans = arr[j];
        }
      }
      System.out.println(q[i] + ": " + ans);
    }
  }
}
