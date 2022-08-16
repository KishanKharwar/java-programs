package com.ds.ashokit.dp;

public class MaxSubArraySum {

  public static void main(String[] args) {
    int[] arr = {-2, -3,4 , -1, -2 , 1 , 5 , -3};
    int sum = maxSubarraySum(arr);
    System.out.println(sum);
  }

  private static int maxSubarraySum(int[] arr) {
    int maxi = arr[0];
    int sum = 0;
    for(int a : arr){
      sum +=a;
      maxi = Math.max(maxi,sum);
      if(sum <0){
        sum = 0;
      }
    }

    return maxi;
  }
}
