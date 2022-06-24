package com.pepcoding.revision;

public class MaxValueInArray10 {

  public static void main(String[] args) {
    int[] arr = {22,33,4,19,7};
    int idx = 0;
    int max = maxOfArray(arr,idx);
    System.out.println(max);
  }

  private static int maxOfArray(int[] arr, int idx) {

    if(idx == arr.length-1){
      return arr[idx];
    }

    int moat1 = maxOfArray(arr,idx+1);
    if(moat1 > arr[idx]){
      return moat1;
    }
    return arr[idx];
  }
}
