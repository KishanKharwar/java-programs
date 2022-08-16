package com.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingSubstring {

  public static void main(String[] args) {
    String str = "geeksforgeeks";
    //findLongestNonRepeatingSubstr2(str);
    find(str);
  }

  private static void find(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    String op = "";
    for (int i = 0, j = 0; j < str.length(); j++) {
      char curr = str.charAt(j);
      if (map.containsKey(curr)) {
        i = Math.max(map.get(curr) + 1, i);
      }
      if (op.length() < j - i + 1) {
        op = str.substring(i,j+1);
      }
      map.put(curr, j);
    }
    System.out.println("String : " + op);
  }

  private static void findLongestNonRepeatingSubstr2(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    String output = "";
    for (int start = 0, end = 0; end < str.length(); end++) {
      if (map.containsKey(str.charAt(end))) {
        start = Math.max(map.get(str.charAt(end)) + 1, start);
      }

      if (output.length() < end - start + 1) {
        output = str.substring(start, end + 1);
      }

      map.put(str.charAt(end), end);
    }
    System.out.println(output);
  }

  private static void findLongestNonRepeatingSubstr(String str) {
    char[] arr = str.toCharArray();
    String test = "";
    String maxString = "";
    int maxLength = 0;
    for (Character c : arr) {
      String s = String.valueOf(c);
      if (test.contains(s)) {
        test = test.substring(test.indexOf(s) + 1);
      }

      test = test + String.valueOf(c);
      if (maxString.length() < maxLength) {
        maxString = test;
      }
      maxLength = Math.max(test.length(), maxLength);
    }

    System.out.println("String : " + maxString + " length : " + maxLength);
  }

  private static void findLongestNonRepeatingSubstr1(String str) {
    char[] arr = str.toCharArray();

    Map<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < arr.length; i++) {
      char c = arr[i];
      System.out.println(map);
      if (!map.containsKey(c)) {
        map.put(c, i);
      } else {
        i = map.get(c);
        map.clear();
      }

    }

    System.out.println("String : " + map.keySet() + " length : " + map.size());
  }

}
