package com.test;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = {2, 7, 3, 1, 5, 2};

    insertionSort(arr, arr.length);
    for(int i : arr){
      System.out.print(i + " ");
    }

  }
  //we will assume that first emelemt is sorted, hence will start the loop from 2nd element.
  private static void insertionSort(int[] arr, int length) { //2,7,3
    for(int i =1;i<length;i++){
      int current = arr[i];
      int pos = i;

      while(pos>0 && current<arr[pos-1]){
        arr[pos] = arr[pos-1];
        pos--;
      }
      arr[pos] = current;
    }
  }
}
