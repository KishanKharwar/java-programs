package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestRepeatingSubstring {

  public static void main(String[] args) {
    //String str = "abcdfghrcdfjty";
    String str = "babad";
    longestRepeatingSubstr(str);
  }

  private static void longestRepeatingSubstr(String str) {
    List<String> list = subString(str);
    Map<String, Integer> map = new HashMap<>();
    for (String s : list) {
      if (map.containsKey(s)) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
      }

    }
  }

  private static List<String> subString(String str) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      //String s = "";
      for (int j = i + 1; j <= str.length(); j++) {
        //s+=str.charAt(j);
        list.add(str.substring(i, j));
      }
    }
    System.out.println(list);
    return list;
  }
}
