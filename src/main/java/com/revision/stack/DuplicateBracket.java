package com.revision.stack;

import java.util.Stack;

public class DuplicateBracket {

  public static void main(String[] args) {
    String str1 = "((a + b) + (c + d))";
    String str2 = "(a + b) + ((c + d))";

    boolean res = checkDuplicateBracket(str2);
    System.out.println("Duplicate bracket present ? " + res);
  }

  private static boolean checkDuplicateBracket(String str) {
    boolean result = false;
    Stack<Character> stack = new Stack<>();
    for(int i = 0;i<str.length();i++){
      char ch = str.charAt(i);
      if(ch == ')'){
        if(stack.peek() == ')'){
          return true;
        }else{
          while(!stack.isEmpty() && stack.peek() == '('){
            stack.pop();
          }
          stack.pop();
        }
      }else {
        stack.push(ch);
      }
    }


    return result;
  }
}
