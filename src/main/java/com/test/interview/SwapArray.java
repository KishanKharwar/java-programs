package com.test.interview;

import java.util.Scanner;

public class SwapArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n+1];
    for(int i = 1;i<=n;i++){
      arr[i] = sc.nextInt();
    }

    printMinSwap(arr);
  }
  private static boolean checkGoodArray(int[] arr){
    boolean result = true;
    for(int i =1;i<=arr.length;i++){
      if(arr[i]%2 == 0 && i%2 == 0){
        continue;
      }else if(arr[i]%2 == 1 && i%2 == 1){
        continue;
      } else {
        result = false;
        break;
      }
    }
    return result;
  }
  private static void printMinSwap(int[] arr){
    int count = 0;
    int left = 1;
    int right = arr.length-1;
    for(int i=1;i<=arr.length;i++){
      if(checkGoodArray(arr)){
        System.out.println("is a good array");
      }else{
          while(left<right){
            if(arr[left]%2 != 0 || left%2 != 0){
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
              left++;
              right--;
              count++;
            }
          }
      }
    }
    System.out.println(count);
  }
}
