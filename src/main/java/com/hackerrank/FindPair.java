package com.hackerrank;

import java.util.Arrays;

public class FindPair {

  public static void main(String[] args) {
    int[] arr = {-4 ,0 ,10, -7};
    Arrays.sort(arr);
    boolean res = ifPairExist(arr,7);
    System.out.println(res == true ? "True" : "False");
  }

  private static boolean ifPairExist(int[] arr,int k ){
    int i = 0;
    int j = arr.length-1;
    while(i < j){
      if(arr[i] + arr[j] == k){
        return true;
      }
      else if(arr[i] + arr[j] > k){
        j--;
      }else if (arr[i] + arr[j] < k){
        i++;
      }
    }

    return false;
  }
}
