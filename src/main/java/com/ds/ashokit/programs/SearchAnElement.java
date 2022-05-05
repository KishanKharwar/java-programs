package com.ds.ashokit.programs;

public class SearchAnElement {

  public static void main(String[] args) {
    int[] arr = {0,2,3,6,6,8 };
    int[] q = {8,2,7,6};

    for(int a : q) {
      boolean result = searchElement(arr,arr.length,a);
      System.out.println(result);
    }
  }

  private static boolean searchElement(int[] arr, int length, int a) {
    int left = 0; int right = arr.length-1;
    while(left <= right){
      int mid = (left + right)/2;
      if(arr[mid] == a){
        return true;
      }
      else if (arr[mid] > a){
        right = mid-1;
      }else if (arr[mid]<a){
        left = mid + 1;
      }
    }

    return false;
  }
}
