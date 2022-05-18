package com.test.bikram.test;


public class MinimumFlips {

  public static void main(String[] args) {
    
    String target = "01011";
    int flips = theFinalProblem(target);
    System.out.println(flips);
  }

  private static int theFinalProblem(String target) {
    int count = 0;

//    int targetInt = Integer.valueOf(target);
//    int dummy = 0;
    //System.out.println(targetInt);
    char[] arr = target.toCharArray();
    for(int i =0;i<arr.length;i++){
      int flipped = 0 ^ arr[i];
      if(flipped != 0){
        //int rsb = (flipped & -flipped);
        //flipped -= rsb;
        count++;
      }
    }

      return count;

  }
}
