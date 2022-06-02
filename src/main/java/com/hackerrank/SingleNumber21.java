package com.hackerrank;
//https://www.hackerrank.com/contests/data-structures-beginner-to-expert/challenges/single-number-2-1
public class SingleNumber21 {

  public static void main(String[] args) {
    int[] arr = {5,3,2,1,2};
    printMissingAndRepeatingNumber(arr,arr.length);
  }

  private static void printMissingAndRepeatingNumber(int[] arr,int n){
    boolean[] bool = new boolean[n + 1];
    int rep = 0;
    for(int i = 0;i<arr.length;i++){
      if(bool[arr[i]] == false){
        bool[arr[i]] = true;
      }else {
        rep = arr[i];
      }

    }
    System.out.print(rep + " ");
    for(int i = 1;i<bool.length;i++){
      if(bool[i] == false){
        System.out.print(i);
      }
    }

  }
}
