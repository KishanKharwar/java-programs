package com.hackerrank2;
//https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
public class Java1DArray {

  public static void main(String[] args) {
    int test = 4;
    int[] arr = {0,0,0,1,1,1};
    int leap = 5;
    boolean result = canWin(leap,arr);
    System.out.println(result);
  }

  public static boolean canWin(int leap, int[] game) {
    boolean result = false;
    int index = 0;
    int len = game.length;

    if(leap == -1){
      if(index != 0 && game[index -1] == 0){
        index--;
        result = true;
      }
    }else if(leap == 1){
      if((index + 1) < len && game[index + 1] == 0){
        index++;
        result = true;
      }
    }else{
      if((index + leap) <= len-1 && game[index + leap] == 0){
        index = index + leap;
        result = true;
      }else if((index + leap) >= len){
        index = index + leap;
        result = true;
      }
    }

    if(index > len -1){
      result = true;
    }
    return result;
  }
}
