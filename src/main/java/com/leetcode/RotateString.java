package com.leetcode;

//https://leetcode.com/problems/rotate-string/
public class RotateString {

  public static void main(String[] args) {
    String s = "abcde", goal = "cdeab";
    boolean res = rotateString(s,goal);
    System.out.println(res);
  }

  public static boolean rotateString(String s, String goal) {

    if(s.length() != goal.length()){
      return false;
    }

    for(int i = 0;i<s.length();i++){
      String ls = s.substring(0,i);
      String rs = s.substring(i);

      if(( rs + ls).equals(goal)){
        return true;
      }
    }

    return false;

  }
}
