package com.array;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 9, 9, 10, 11 , 12 , 12 , 34 , 45, 11};
        printDuplicateElements(arr);
    }

    private static void printDuplicateElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean duplicate = false;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    duplicate = true;
                }
            }
            if(duplicate){
                System.out.println(arr[i]);
            }


        }
    }
}
