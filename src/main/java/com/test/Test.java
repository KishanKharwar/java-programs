package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<String>  lits = Arrays.asList("Kishan","Mohit","Mansi","Kishan");
        List<String> ans = lits.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);

        //int[] arr = {1,2,3,4,5,6,7,8};
       // System.out.println(Arrays.toString(arr));

//       String name = "Mike";
//        int id = 1;
//        Double elo = 2400.00;

//        Formatter f = new Formatter();
//        System.out.println(f.format("%-10s",name));
        //System.out.printf("%20s",name);
        //System.out.printf("%5d",id);
        //System.out.printf("%10.2f",elo);


        //int arr[] = {1,2,3};
        //findSubArray2(arr);
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
