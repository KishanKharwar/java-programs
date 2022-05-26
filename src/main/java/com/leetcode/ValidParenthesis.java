package com.leetcode;

import java.util.Stack;

public class ValidParenthesis {

  public static void main(String[] args) {
    String s = "]";
    boolean result = isValid(s);
    System.out.println(result);
  }

  public static boolean isValid(String s) {
    char[] arr = s.toCharArray();
    Stack<Character> stack = new Stack<>();

    for (Character ch : arr) {
      if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
        stack.pop();
        continue;
      } else if (!stack.isEmpty() && stack.peek() == '{' && ch == '}') {
        stack.pop();
        continue;
      } else if (!stack.isEmpty() && stack.peek() == '[' && ch == ']') {
        stack.pop();
        continue;
      }
      stack.push(ch);
    }

    if (stack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
