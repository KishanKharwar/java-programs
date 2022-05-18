package com.test.bikram.test;


public class MinimumFlips {

  public static void main(String[] args) {
    
    String target = "01011";
    int flips = theFinalProblem(target);
    System.out.println(flips);
  }

  private static int theFinalProblem(String target) {
    int count = 0;
    char curr = '1';
    for(int i =0;i<target.length();i++){
      if(target.charAt(i) == curr){
        count++;
        curr = (char)(48 + (curr + 1)%2);
      }
    }
    return count;
  }
}
