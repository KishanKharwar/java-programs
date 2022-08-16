package com.ds.ashokit.dp;

public class Fibonacci {

  public static void main(String[] args) {
    int n = 10;
    //int num = printFibonacciDP(n, new int[n + 1]);
    int num = optimizedSpaceFibonacci(n);
    System.out.println("Fib No : " + num);

  }

  private static int printFibonacciRecursion(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    //System.out.print(n + " ");
    return printFibonacciRecursion(n - 1) + printFibonacciRecursion(n - 2);
  }

  private static int printFibonacciDP(int n, int dp[]) {
    if (n == 0 || n == 1) {
      return n;
    }

    if (dp[n] != 0) {
      return dp[n];
    }
    //System.out.println(n + " ");
    int fib1 = printFibonacciDP(n - 1,dp);
    int fib2 = printFibonacciDP(n - 2,dp);
    int fib = fib1 + fib2;
    dp[n] = fib;
    return fib;
  }

  private static int optimizedSpaceFibonacci(int n){

    int a = 0;
    int b = 1;
    int c ;
    for(int i = 1;i<n;i++){
      c = a + b;
      System.out.print(c +" ");
      int temp = b;
      b = c;
      a = temp;
    }

    return b;
  }
}
