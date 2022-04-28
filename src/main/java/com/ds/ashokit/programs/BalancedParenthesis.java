package com.ds.ashokit.programs;

import java.util.Stack;

public class BalancedParenthesis {

  public static void main(String[] args) {
    String s1 = "{[]{(){}}()[]}";
    String s2 = "{[(){]}}";
    Stack<Character> st1 = new Stack<>();

    boolean result = isBalancedParenthesis(s2);
    System.out.println(result);
  }

  private static boolean isBalancedParenthesis(String s1) {
    if (s1 == null || s1.length() == 0) {
      return false;
    }
    Stack stack = new Stack();
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == '{' || s1.charAt(i) == '[' || s1.charAt(i) == '(') {
        stack.push(s1.charAt(i));
      } else if (s1.charAt(i) == ')') {
          if(!stack.isEmpty() && (char)stack.peek() == '('){
            stack.pop();
          }else{
            return false;
          }
      }else if(s1.charAt(i) == '}'){
        if(!stack.isEmpty() && (char) stack.peek() == '{'){
          stack.pop();
        }else{
          return false;
        }
      }else if (s1.charAt(i) == ']'){
        if(!stack.isEmpty() && (char) stack.peek() == '['){
          stack.pop();
        }else{
          return false;
        }
      }
    }
    return  stack.isEmpty();
  }
}
