package com.array;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 10, 9, 21, 4, 10};
        printUniqueElement(arr);
    }

    private static void printUniqueElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i] == arr[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(arr[i]);
            }
        }
    }
}
