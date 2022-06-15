package com.test;

import java.util.Stack;

public class Generics {

  public static void main(String[] args) {
    String s = "}{";
    boolean res = isBalanced(s);
    System.out.println(res);
  }
  private static boolean isBalanced(String str){
    Stack<Character> st = new Stack<>();

    for(int i = 0;i<str.length();i++){
      char ch = str.charAt(i);

      if(ch == '(' || ch == '{' || ch == '['){
        st.push(ch);
      }else if(ch == ')'){
        if(st.size() > 0 && st.peek() == '('){
          st.pop();
        }else{
          return false;
        }

      }else if(ch == '}'){
        if( st.size() > 0 &&  st.peek() == '{'){
          st.pop();
        }else{
          return false;
        }
      }else if(ch == ']'){
        if(st.size() > 0 &&  st.peek() == '['){
          st.pop();
        }else{
          return false;
        }
      }

    }
    if(st.isEmpty()){
      return true;
    }else{
      return false;
    }

  }
}
