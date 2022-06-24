package com.pepcoding.revision;

public class PrintIncreasing2 {

  public static void main(String[] args) {
    int n = 5;
    printIncreasing(n);
  }

  private static void printIncreasing(int n) {
    if(n == 0){
      return;
    }

    printIncreasing(n-1);
    System.out.println(n);
  }
}
