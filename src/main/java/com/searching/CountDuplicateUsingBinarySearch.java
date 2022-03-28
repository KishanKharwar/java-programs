package com.searching;

public class CountDuplicateUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,7,7,7,7,7,7};
        int search = 7;
        int first = countNum(arr,search,true) ;
        int last = countNum(arr,search,false) ;

        int count = last - first + 1;
        System.out.println(count);
        //countNum(arr,search);
    }

    private static int countNum(int[] arr, int search,boolean searchElement) {
        int first = 0, last = arr.length-1,mid;

        int result = -1;
        while(first <= last){ // 0-6  0-2
            mid = (first + last)/2;
            if(arr[mid] == search){
                result = mid; //3 1

                if(searchElement){
                    last = mid-1;
                }else {
                    first = mid+1;
                }

            }
            if(arr[mid] > search){
               last = mid -1;
            }

            if(arr[mid] < search){
                first = mid + 1;
            }
        }

        return result;
    }
}
