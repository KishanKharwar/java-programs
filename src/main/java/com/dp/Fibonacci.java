package com.dp;

public class Fibonacci {

  static int count = 0;

  public static void main(String[] args) {
    int num = 11;

    int fibNum = fibonacciUsingDP(num, new int[num + 1]);
    System.out.println(fibNum);
//        int fibNum = findFibonacci(num);
//        System.out.println(fibNum);
    System.out.println("Count : " + count);
  }

  private static int fibonacciUsingDP(int num, int[] q) {

    if (num == 0 || num == 1) {
      return num;
    }

    if (q[num] != 0) {
      return q[num];
    }
    count++;
    System.out.println("Hello : " + num);
    int fib1 = fibonacciUsingDP(num - 1, q);
    int fib2 = fibonacciUsingDP(num - 2, q);
    int fib = fib1 + fib2;

    q[num] = fib;

    return q[num];

  }


  private static int findFibonacci(int num) {

    if (num == 0 || num == 1) {
      return num;
    }
    count++;
    System.out.println("hello " + num);
    int fib1 = findFibonacci(num - 1);
    int fib2 = findFibonacci(num - 2);
    int fib = fib1 + fib2;

    return fib;

  }
}
