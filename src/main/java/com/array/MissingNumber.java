package com.array;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    //list of 100 non
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,15,9,1,71,77,81,29,70,19,11,83,56,2,57,53,68,99,82,100,22,10,51,40,34,98,80,38,39,89,94,4,26,64,45,8,90,24,93,33,21,7,49,88,5,28,55,67,65,50,32,58,6,37,46,42,20,44,41,3,78,76,73,16,31,85,91,54,60,47,97,43,84,17,35,69,13,30,61,79,72,48,23,66,52,27,62,87,63,18,75,96,14,86,95,74,25,59,92);
        sum(list);
    }

    private static void sum(List<Integer> list){
        int sum = 0;
        int totalSum = 100 * (100 + 1) /2;
        for(Integer i : list){
            sum +=i;
        }

        System.out.println("Missing num = " + (totalSum - sum));
    }
}
