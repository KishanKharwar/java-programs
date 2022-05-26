package com.searching;

public class FindMissingAndRepeatingNumber {

  public static void main(String[] args) {
    int[] arr = {4, 3, 6, 2, 1, 1};
    findMissingAndRepeating(arr);
  }

  private static void findMissingAndRepeating(int[] arr){
    boolean[] bool = new boolean[arr.length + 1];
    for(int i = 0;i<arr.length;i++){
      if(bool[arr[i]] == false){
        bool[arr[i]] = true;
      }else{
        System.out.println("Repeating Number : " + arr[i]);
      }
    }

    for(int i = 1;i<bool.length;i++){
      if(bool[i] == false){
        System.out.println("Missing Number : "+i);
      }
    }
  }
}
