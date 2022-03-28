package com.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {9, 5, 7, 2,8,11, 232 ,44, 1 ,23 , 12,3};
        bubbleSort(arr);
    }


    private static void bubbleSort(int[] arr) {

       for (int i=0;i<arr.length-1;i++){
           for (int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
           }
       }

       for(Integer i : arr){
           System.out.print(i + " ");
       }
    }

}
