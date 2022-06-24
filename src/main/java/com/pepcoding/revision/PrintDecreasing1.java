package com.pepcoding.revision;

public class PrintDecreasing1 {

  public static void main(String[] args) {
    int n = 5;
    printDecreasing(n);
  }

  private static void printDecreasing(int n) {
    if(n == 0)
      return;

    System.out.println(n);
    printDecreasing(n-1);
  }
}
