package com.test;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String str = "anupam";
        longestNonRepeatingSubstring(str);
    }

    private static void longestNonRepeatingSubstring(String str) {
        int maxLength = -1;
        String finalString = "",test = "";
        char[] chars = str.toCharArray();
        for(Character c : chars){
            String s = String.valueOf(c);

            if(test.contains(s)){
                test = test.substring(test.indexOf(s) + 1);
            }
            test = test + s;
            if(finalString.length()<test.length()){
                finalString = test;
            }
            maxLength = Math.max(test.length(),maxLength);
        }

        System.out.println("Max String : " + finalString + " Max Length : " + maxLength);
    }
}
