package com.pepcoding.revision;

public class Factorial4 {

  public static void main(String[] args) {
    int n = 5;
    int fact = factorial(n);
    System.out.println(fact);
  }

  private static int factorial(int n) {
    if(n == 0 || n == 1){
      return n;
    }
    int factNm1 = factorial(n-1);
    int factN = n * factNm1;
    return factN;
  }
}
