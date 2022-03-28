package com.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingSubstring {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        findLongestNonRepeatingSubstr1(str);
    }

    private static void findLongestNonRepeatingSubstr(String str) {
        char[] arr = str.toCharArray();
        String test = "";
        String maxString = "";
        int maxLength = 0;
        for(Character c : arr){
            String s = String.valueOf(c);
            if(test.contains(s)){
                test = test.substring(test.indexOf(s) + 1);
            }

            test = test + String.valueOf(c);
            if(maxString.length()<maxLength){
                maxString = test;
            }
            maxLength = Math.max(test.length(),maxLength);
        }

        System.out.println("String : "+maxString + " length : " +maxLength);
    }

    private static void findLongestNonRepeatingSubstr1(String str) {
        char[] arr = str.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i< arr.length;i++){
            char c = arr[i];
            if(!map.containsKey(c)){
                map.put(c,i);
            }else {
                i= map.get(c);
                map.clear();
            }

        }

        System.out.println("String : "+map.keySet() + " length : " +map.size());
    }

}
