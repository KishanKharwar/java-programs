package com.test.mohit.axyya;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountingBrackets {

  public static void main(String[] args) {
    String str = "(hello (world))";
    String str1 = "(coder)(bite))";
    String s = checkBalancedBracket(str1);
    System.out.println(s);
  }

  public static String checkBalancedBracket(String s) {

    char[] arr = s.toCharArray();
    List<Character> charList = new ArrayList<>();
    for (char ch : arr) {
      if (ch == '(' || ch == ')') {
        charList.add(ch);
      }
    }
    Stack<Character> stack = new Stack<>();
    int i = 0;
    while (i < charList.size()) {
      if (!stack.isEmpty() && charList.get(i) == ')') {
        stack.pop();
        i++;
        continue;
      }

      stack.push(charList.get(i));
      i++;
    }

    if (stack.isEmpty()) {
      return "1";
    }

    return "0";
  }
}
