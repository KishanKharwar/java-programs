package com.test;

public class Test {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        findSubArray2(arr);
    }

    private static void findSubArray2(int[] arr){
        for(int j=0, i=0;i<arr.length;++i){
            System.out.println(arr[i] +" " + arr[j]);
            if(i == arr.length -1){
                i = j++;//++j - 1;
                System.out.println();
            }
        }
    }

    private static void findSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String res = "";
            for (int j = i; j < arr.length; j++) {
                res += arr[j] + " ";
                System.out.println(res);
            }
        }
    }
}
