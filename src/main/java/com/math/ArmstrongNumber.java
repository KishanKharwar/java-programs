package com.math;

public class ArmstrongNumber {

  public static void main(String[] args) {
    int num = 153;
    int res = checkArmstrongNumber(num);
    System.out.println(res == num ? true : false);
  }

  private static int checkArmstrongNumber(int num) {

    int sum = 0, rem = 0;
    while (num > 0) {
      rem = num % 10;
      sum += rem * rem * rem;
      num = num / 10;
    }
    return sum;
  }
}
