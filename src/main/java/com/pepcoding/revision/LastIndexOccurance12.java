package com.pepcoding.revision;

public class LastIndexOccurance12 {

  public static void main(String[] args) {
    int[] arr = {2, 3, 9, 8, 7, 6, 4, 12, 7, 3, 8};
    int data = 8;
    int idx = 0;
    int resIdx = lio(arr, idx, data);
    System.out.println(resIdx);
  }

  private static int lio(int[] arr, int idx, int data) {
    if(idx == arr.length){
      return -1;
    }
    int lisa = lio(arr,idx + 1,data);
    if(lisa == -1){
      if(arr[idx] == data){
        return idx;
      }else{
        return -1;
      }
    }else{
      return lisa;
    }

  }
}
