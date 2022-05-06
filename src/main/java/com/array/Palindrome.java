package com.array;

public class Palindrome {

  public static void main(String[] args) {
    String str = "12121";
    System.out.println(isPalindrome(str));
  }

  private static boolean isPalindrome(String str) {
    if (str.length() == 0 || str.length() == 1) {
      return true;
    }
    if (str.charAt(0) == str.charAt(str.length() - 1)) {
      return isPalindrome(str.substring(1, str.length() - 1));
    }
    return false;
  }
}
