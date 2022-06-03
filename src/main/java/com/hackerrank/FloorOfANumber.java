package com.hackerrank;

import java.util.Stack;

public class FloorOfANumber {

  public static void main(String[] args) {
    int[] arr = {-6, -1, 5, 10, 15, 20};
    int[] testCases = {-1,10,8,-10,-4};
    for(int num : testCases){
      int floor = findFloor(arr,num);
      System.out.println(floor);
    }

  }

  private static int findFloor(int[] arr, int num) {
    int hi = arr.length -1;
    int lo = 0;
    int mid = 0;
    int ans = Integer.MIN_VALUE;
    while(lo<=hi){
      mid = (hi + lo)/2;

      if(arr[mid] == num){
        ans = arr[mid];
        return ans;
      }else if(arr[mid] > num){
        hi = mid-1;

      }else{
        lo = mid + 1;
        ans = arr[mid];
      }
    }

    return ans;
  }
}
