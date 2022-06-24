package com.pepcoding.revision;

public class PrintDecreasingIncreasing3 {

  public static void main(String[] args) {
    int n = 5;
    pdi(n);
  }

  private static void pdi(int n) {
    if(n == 0){
      return;
    }
    System.out.println(n);
    pdi(n-1);
    System.out.println(n);
  }
}
