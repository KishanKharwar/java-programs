package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 9, 21, 4, 10};
        printUniqueElement(arr);
    }

    private static void printUniqueElement(int[] arr) {
        Set<Integer> list = new HashSet<>();
        for(int i=0;i<arr.length -1;i++){
            boolean duplicate = false;
            for(int j=(i + 1);j<arr.length;j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                }
            }
            if(duplicate){
                
            }

        }
        System.out.println(list);
    }
}
