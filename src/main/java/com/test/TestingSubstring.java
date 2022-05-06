package com.test;

import java.util.HashSet;
import java.util.Set;

public class TestingSubstring {

  public static void main(String[] args) {
    String s = "anupam";
    //checkingSubstringFunctionOfStringclass(s);
    int len = lengthOfLongestSubstring(s);
    System.out.println(len);
  }

  private static void checkingSubstringFunctionOfStringclass(String s) {
    String substr = s.substring(1, s.length() - 1);
    System.out.println(substr);
  }

  public static int lengthOfLongestSubstring(String s) {
    Set<Character> stringWithoutDublicate = new HashSet<>();
    int len = 0;
    if (s != null && !s.trim().isEmpty() && !s.isEmpty()) {
      String updatedString = s.substring(1, s.length() - 1);
      char[] ch = updatedString.toCharArray();
      for (char c : ch) {
        stringWithoutDublicate.add(c);
      }
      StringBuffer s1 = new StringBuffer();
      for (Character c1 : stringWithoutDublicate) {
        s1.append(c1);
      }
      len = s1.length();
    } else {
      return 1;
    }
    return len;
  }
}
