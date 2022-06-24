package com.leetcode;

//https://leetcode.com/problems/reverse-string-ii/
public class ReverseStringII {

  public static void main(String[] args) {
    String s = "abcdefg";
    int k = 2;
    String res = reverseWithKthValue(s, k);
    System.out.println(res);
  }

  private static String reverseWithKthValue(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
      return s;
    }

    StringBuilder sb = new StringBuilder(s);
    int i = 0;
    while(i<s.length()){
      int left = i;
      int right = Math.min(i + k -1,s.length()-1);
      while (left < right){
        char a = sb.charAt(left);
        char b = sb.charAt(right);
        sb.setCharAt(left,b);
        sb.setCharAt(right,a);
        left++;
        right--;
      }

      i = i + 2*k;
    }
    return sb.toString();
  }
}
