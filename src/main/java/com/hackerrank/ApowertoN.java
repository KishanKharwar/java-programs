package com.hackerrank;

import java.util.Scanner;

public class ApowertoN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      long a = sc.nextLong();
      long b = sc.nextLong();
      long pow = getPower(a,b);
      System.out.println(pow);
    }
  }

  private static long getPower(long a, long b) {
    if(b == 0){
      return 1;
    }
    long powxb2 = getPower(a,b/2);
    long pow = powxb2 * powxb2;
    if(b % 2 == 1){
      pow = a * pow;
    }
    return  pow;
  }
}
