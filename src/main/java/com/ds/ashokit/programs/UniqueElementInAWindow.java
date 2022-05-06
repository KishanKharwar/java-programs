package com.ds.ashokit.programs;

import java.util.HashMap;

public class UniqueElementInAWindow {

  public static void main(String[] args) {
    int[] arr = {-1, 10, 7, -1, 5, 6, 8, 5};
    int k = 4;
    findUnique(arr, k);
  }

  private static void findUnique(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length - k + 1; i++) {
      for (int j = i; j < k + i; j++) {
        int a = arr[i];
        //if(map.containsKey())
      }
    }

  }
}
