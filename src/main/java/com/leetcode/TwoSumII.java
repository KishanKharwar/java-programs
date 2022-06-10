package com.leetcode;

import java.util.Arrays;

public class TwoSumII {

  public static void main(String[] args) {
    //int[] arr = {2,7,11,15};
    int[] arr = {5,25,75};
    int target = 100;
    int[] res = twoSum(arr,target);
    System.out.println(Arrays.toString(res));
  }
  public static int[] twoSum(int[] numbers, int target) {
    int[] index = new int[2];

    int hi = numbers.length-1;
    int lo = 0;
    while(lo<=hi){
      if((numbers[lo] + numbers[hi]) > target){
        hi--;
      }else if(numbers[lo] + numbers[hi] < target){
        lo++;
      }else{
        index[0] = lo +1;
        index[1] = hi + 1;
        return index;
      }
    }
    return index;
  }
}
