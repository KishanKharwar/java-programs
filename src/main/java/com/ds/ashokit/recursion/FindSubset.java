package com.ds.ashokit.recursion;

public class FindSubset {

  public static void main(String[] args) {
    int[] arr = {3,-4,8,10};
    int sum = 7;
    int len = arr.length;
    int index = 0,tempSum = 0;
    boolean result = checkSubsets(arr,len,sum,tempSum,index);
    System.out.println(result);
  }
  private static boolean checkSubsets(int[] arr, int len, int sum, int tempSum, int index) {
    System.out.println("temp sum : " + tempSum + " index : " + index);
    if(len == index){
      return sum == tempSum;
    }

    return checkSubsets(arr,len,sum, tempSum + arr[index],index + 1 )
        || checkSubsets(arr,len,sum,tempSum,index + 1);
  }
}
