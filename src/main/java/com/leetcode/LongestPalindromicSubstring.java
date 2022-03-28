package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        findLongestPalindromicSubstring(s);
    }

    private static void findLongestPalindromicSubstring(String s) {
        Set<String> list = new HashSet<>();
        createSubString3(s, list);

        String longestPString="";
        int max = 0;
        for(String str : list){
            if(checkPalindrome(str) && max<str.length()){
                longestPString = str;
                max = str.length();
            }
        }
        System.out.println("Longest String : "+longestPString);
    }

    private static boolean checkPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return checkPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }


    private static void createSubString3(String s, Set<String> list) {
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j <s.length(); j++) {
                str += s.charAt(j);
                list.add(str);
            }
        }
        System.out.println(list);
    }


    private static void createSubString(String s, Set<String> list) {
        int len = s.length();
        for (int c = 0; c < len; c++) {
            for (int i = 1; i <= len - c; i++) {
                // System.out.println(s.substring(c,c+i));
                list.add(s.substring(c, c + i));
            }
        }
        System.out.println(list);
    }

    private static void createSubString2(String s, Set<String> list) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                list.add(s.substring(i,j));
            }
        }
        System.out.println(list);
    }
}