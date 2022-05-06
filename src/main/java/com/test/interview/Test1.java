package com.test.interview;

import java.util.Arrays;

public class Test1 {

  public static void main(String[] args) {
    int[] arr = {5, 12, 10, 15, 17, 20};
    Arrays.stream(arr).filter(a -> a % 5 == 0).forEach(System.out::println);
  }
}
