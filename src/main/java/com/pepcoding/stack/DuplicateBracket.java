package com.pepcoding.stack;

import java.util.Stack;

public class DuplicateBracket {

  public static void main(String[] args) {
    String s1 = "((a + b) + (c + d))";
    String s2 = "(a+b) + ((c + d))";

    boolean result1 = checkDuplicateBracket(s1);
    boolean result2 = checkDuplicateBracket(s2);
    System.out.println(result1 + " " + result2);
  }

  private static boolean checkDuplicateBracket(String str) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == ')') {
        if (st.peek() == '(') {
          return true;
        } else {
          while (st.peek() != '(') {
            st.pop();
          }
          st.pop();
        }
      } else {
        st.push(ch);
      }
    }

    return false;
  }
}
