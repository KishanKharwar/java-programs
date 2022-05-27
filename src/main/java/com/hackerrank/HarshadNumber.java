package com.hackerrank;

public class HarshadNumber {

  public static void main(String[] args) {
    long num = 18;
    boolean res = checkHarshadNum(num);
    System.out.println(res);
  }

  private static boolean checkHarshadNum(long n){
    long rem = 0;
    long num = n;
    long sum = 0;
    while(num>0){
      rem = num%10;
      sum+=rem;
      num = num/10;
    }

    if(n%sum == 0){
      return true;
    }
    return false;
  }
}
