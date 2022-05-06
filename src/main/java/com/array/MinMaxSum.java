package com.array;

public class MinMaxSum {

  public static void main(String[] args) {
    //long[] arr = {1, 2, 3, 4, 5};
    Integer[] arr = {7, 69, 2, 221, 8974};
    miniMaxSum(arr);
  }

  // find sum of all the element
  //find min and max element in array
  //subtract min element with the sum to get sum of all 4 big num
  //subtract max element with the sum to get sum of all 4 small num
  private static void miniMaxSum(Integer[] arr) {
    int max = 1, min = arr[0], sum = 0;

    for (Integer i : arr) {
      if (i > max) {
        max = i;
      } else if (i < min) {
        min = i;
      }
      sum += i;
    }
    System.out.println(min);
    System.out.println(max);
    System.out.println(sum);
    System.out.println((sum - max) + " " + (sum - min));
  }
}
