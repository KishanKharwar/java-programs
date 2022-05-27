package com.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfLongestNonRepeatingSubstring {

  public static void main(String[] args) {
    String s = "abcabcbbacd";
    int len = lengthOfLongestSubstring(s);
    System.out.println(len);
  }

  public static int lengthOfLongestSubstring(String s) {
    char[] chars = s.toCharArray();
    String longestSubString = "";
    int maxLength = -1;
    Map<Character,Integer> map = new LinkedHashMap<>();
    if(s.length() == 0 || s.length() == 1){
      return s.length();
    }

    for(int i = 0;i<chars.length;i++){
      char ch = chars[i];
      if(!map.containsKey(ch)){
        map.put(ch,i);
      }else{
        i = map.get(ch);
        map.clear();
      }

      if(map.size() > maxLength){
        maxLength = map.size();
        longestSubString = map.keySet().toString();
      }
      //maxLength = Math.max(map.size(),maxLength);
    }
    System.out.println(longestSubString);
    return maxLength;
  }

  public static int lengthOfLongestSubstringII(String s) {
    char[] chars = s.toCharArray();
    String test = "";
    int maxLength = -1;

    if(s.length() == 0 || s.length() == 1){
      return s.length();
    }

    for(Character c : chars){
      String str = String.valueOf(c);

      if(test.contains(str)){
        test = test.substring(test.indexOf(str) + 1);
      }

      test = test + str;
      maxLength = Math.max(test.length(),maxLength);
    }

    return maxLength;
  }



}
