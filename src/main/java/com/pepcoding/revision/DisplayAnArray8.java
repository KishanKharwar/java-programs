package com.pepcoding.revision;

public class DisplayAnArray8 {

  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};
    int idx = 0;
    printArray(arr,idx);
  }

  private static void printArray(int[] arr, int idx) {
    if(idx == arr.length){
      return;
    }
    System.out.println(arr[idx]);
    printArray(arr,idx + 1);
  }
}
