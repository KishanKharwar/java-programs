package com.java8;

import java.util.stream.IntStream;

public class IntStreamClass {

  public static void main(String[] args) {
    int[] arr = {5, 5, 4, 3, 1, 4, 5, 4, 5};
    int[] result = removeDuplicate(arr);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }

  private static int[] removeDuplicate(int[] arr) {
    return IntStream.of(arr).distinct().toArray();
  }
}
