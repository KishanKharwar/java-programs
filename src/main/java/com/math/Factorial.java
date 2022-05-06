package com.math;

public class Factorial {

  public static void main(String[] args) {
    int num = 4;
    int result = factorial(num);
    System.out.println(result);
  }

  private static int factorial(int num) {
    if (num == 0) {
      return 1;
    }
    return num * factorial(num - 1);
  }


}
