package com.leetcode;

public class ReverseVowelsOfString {

  public static void main(String[] args) {
    String s = "leetcode";
    String s1 = "aA";
    String rev = reverseVowels(s1);
    System.out.println(rev);
  }

  private static String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder(s);
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
          char a = s.charAt(left);
          char b = s.charAt(right);
          sb.setCharAt(left,b);
          sb.setCharAt(right,a);
          left++;
          right--;
      }else if(isVowel(s.charAt(left))){
        right--;
      }else if(isVowel(s.charAt(right))){
        left++;
      }else{
        left++;right--;
      }
    }
    return sb.toString();
  }

  private static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'u' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'A' || ch == 'U' || ch == 'O' || ch == 'I' || ch == 'E') {
      return true;
    }
    return false;
  }
}
