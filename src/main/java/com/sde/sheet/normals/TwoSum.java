package com.sde.sheet.normals;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/?msclkid=53e8a6f6ab9711ec870b88cef40c141f
public class TwoSum {
    public static void main(String[] args) {
       // int[] arr = {2,7,11,15};
       // int target = 9;

        int[] arr = {3,2,4};
        int target = 6;

        //brute force solution
        //printThePosition1(arr,target);

        //optimized solution
        printThePosition2(arr,target);
    }

    private static void printThePosition2(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target - arr[i])){
                System.out.println(map.get(target - arr[i]) + "," + i);
            }
            map.put(arr[i],i);
        }
    }

    private static void printThePosition1(int[] arr, int target) {
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length-1;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+","+j);
                    break;
                }
            }
        }
    }
}
