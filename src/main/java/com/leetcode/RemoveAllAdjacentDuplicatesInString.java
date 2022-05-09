package com.leetcode;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.Stack;

/**
 * Input: s = "abbaca" Output: "ca"
 */
public class RemoveAllAdjacentDuplicatesInString {

  public static void main(String[] args) {
    String s = "abbaca";
    String result = removeDuplicates(s);
    System.out.println(result);
  }

  public static String removeDuplicates(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
        stack.pop();
        continue;
      }
      stack.push(s.charAt(i));
    }
    if (stack.isEmpty()) {
      return "";
    } else {
      return remove(stack);
    }
  }

  public static String remove(Stack st) {
    StringBuilder s = new StringBuilder();
    while (!st.isEmpty()) {
      s.append(st.pop());
    }
    return s.reverse().toString();
  }
}
