package com.searching;

import java.util.Arrays;

//https://leetcode.com/problems/magnetic-force-between-two-balls/
public class MagneticForceBwTwoBalls {

  public static void main(String[] args) {
    //int[] arr = {1,2,3,4,7};
    int[] arr = {79, 74, 57, 22};
    int balls = 4;
    int ans = maxDistance(arr, balls);
    System.out.println(ans)
    ;

  }

  public static int maxDistance(int[] position, int m) {
    Arrays.sort(position);
    int ans = 0;
    int len = position.length;
    int low = 1;
    int high = position[len - 1];
    while (low <= high) {
      int mid = (low + high) / 2;
      int prev = position[0];
      int ball = 1;
      for (int i = 1; i < len; i++) {
        if (position[i] - prev >= mid) {
          ball++;
          prev = position[i];
          if (ball == m) {
            break;
          }
        }
      }
      if (ball == m) {
        ans = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return ans;
  }
}
