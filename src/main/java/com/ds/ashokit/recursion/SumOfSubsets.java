package com.ds.ashokit.recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubsets {

  public static void main(String[] args) {
    int[] arr = {3,-4,8,10};
    int sum = 9;
    int len = arr.length;
    int index = 0,tempSum = 0;
    boolean result = checkSumForSubsets(arr,len,sum,tempSum,index);
    System.out.println(result);
  }

  private static boolean checkSumForSubsets(int[] arr, int len, int sum, int tempSum, int index) {
    System.out.println("temp sum : " + tempSum + " index : " + index);
    if(len == index){
      return sum == tempSum;
    }

    return checkSumForSubsets(arr,len,sum, tempSum + arr[index],index + 1 )
            || checkSumForSubsets(arr,len,sum,tempSum,index + 1);
  }

}
