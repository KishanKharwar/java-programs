package com.ds.ashokit.programs;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowUsingHashMap {

  public static void main(String[] args) {
    int[] arr = {10, 15, 13, 18, 25, 12, 7, 3, 5, 1, 4, -6, 2};
    int k = 4;

    getMaxInWindow(arr, k);
  }

  private static void getMaxInWindow(int[] arr, int k) {
    Map<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<k;i++){
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }


    for (int i = k; i < arr.length - k + 1; i++) {
      int removableIndex = i-k;

      if(map.containsKey(arr[i])){
        //map.put()
      }


//      for (int j = i; j < i + k; j++) {
//        if (max < arr[j]) {
//          max = arr[j];
//        }
//      }
//      System.out.print(max + " ");
    }
  }

//  private static void getMaxInWindow(int[] arr, int k) {
//
//    for (int i = 0; i < arr.length - k + 1; i++) {
//      int max = arr[i];
//
//      for (int j = i; j < i + k; j++) {
//        if (max < arr[j]) {
//          max = arr[j];
//        }
//      }
//      System.out.print(max + " ");
//    }
//  }
}
