package com.pepcoding.revision;

import java.util.Arrays;

//https://www.youtube.com/watch?v=bQkwHBaNioE&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=24
public class AllIndicesOfOccurance13 {

  public static void main(String[] args) {
    int[] arr = {2,3,6,9,8,3,2,3,6,4};
    int data = 3;
    int[] res = getAllIndices(arr,0,data,0);
    System.out.println(Arrays.toString(res));
  }

  private static int[] getAllIndices(int[] arr,int idx, int data, int fsf) {
    if(idx == arr.length){
      return new int[fsf];
    }

    if(arr[idx] == data){
      int[] idxArr = getAllIndices(arr,idx + 1, data,fsf +1);
      idxArr[fsf] = idx;
      return idxArr;
    }else {
      int[] idxArr = getAllIndices(arr,idx + 1, data,fsf);
      return idxArr;
    }

  }
}
