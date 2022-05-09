package com.test.bikram.test;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] arr = {1, 0, 1, 2, 0, 3, 0, 4, 6, 7, 0, 0, 0, 3, 2, 0, 5,};

    int[] result = new int[arr.length];
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        continue;
      }
      result[count] = arr[i];
      count++;
    }
    System.out.println(Arrays.toString(result));

//    addZeroToEnd(arr,result);

//    String s = "AshokIt";
//    System.out.println(s.substring(4, 5));
  }
}
