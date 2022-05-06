package com.array;

public class MaxMinArray {

  public static void main(String[] args) {
    int arr[] = {-2, -19, 8, 15, 4};

    findMaxAndMin(arr);
  }

  private static void findMaxAndMin(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

        /*for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }*/

    for (Integer i : arr) {
      if (i > max) {
        max = i;
      } else if (i < min) {
        min = i;
      }
    }

    System.out.println(min + " " + max);
  }


}
