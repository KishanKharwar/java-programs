package com.pepcoding.recursion;

public class Power {

  public static void main(String[] args) {
    int base = 4;
    int exp = 3;
    int power = powerWithLessComplexity(base, exp);
    System.out.println(power);
  }

  //logarathmic function for calculating power
  private static int powerWithLessComplexity(int base, int exp) {
    if (exp == 0) {
      return 1;
    }

    int beb2 = powerWithLessComplexity(base, exp / 2);
    int pow = beb2 * beb2;

    if (exp % 2 == 1) {
      pow = base * pow;
    }

    return pow;

  }

  //this function is having complexity as O(N)
  private static int power(int base, int exp) {
    if (exp == 0) {
      return 1;
    }
    return base * power(base, exp - 1);
  }
}
