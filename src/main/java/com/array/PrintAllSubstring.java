package com.array;

import java.util.HashSet;
import java.util.Set;

public class PrintAllSubstring {

  public static void main(String[] args) {
    String str = "babad";
    createSubString1(str);
  }

  private static void createSubString(String str) {
    Set<String> set = new HashSet<>();
    int len = str.length();
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j <= len; j++) {
        set.add(str.substring(i, j));
      }
    }
    System.out.println(set);
  }

  private static void createSubString1(String str) {
    Set<String> set = new HashSet<>();
    int len = str.length();
    for (int i = 0; i < len; i++) {
      String s = "";
      for (int j = i; j < len; j++) {
        s = s + str.charAt(j);
        set.add(s);
      }
    }
    System.out.println(set);
  }
}
