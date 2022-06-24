package com.hackerrank;

public class DistinctElementsInAWindow {

  public static void main(String[] args) {
    int[] arr = {-2 ,-4, -2, 4, -2};
    int k = 3;
    printDiscinctCountInWindowSize(arr,k);
  }

  private static void printDiscinctCountInWindowSize(int[] arr, int k) {
    int win = arr.length - k;
    int count = 0;
    for(int i = 0;i<win;i++){
      count = 0;
      for(int j = i;i<k;j++){
        count++;
      }
    }
  }
}
