package com.leetcode;

import java.util.Stack;

public class BackspaceStringCompare {

  public static void main(String[] args) {
    //String s = "ab#c", t = "ad#c";
    //String s = "ab##", t = "c#d#";
    String s = "y#fo##f";
    String t = "y#f#o##f";
    boolean res = backspaceCompare(s).equals(backspaceCompare(t));
    System.out.println(res);
  }

  public static String backspaceCompare(String s) {
    if(s.length() == 0){
      return null;
    }
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    for(int i = 0;i<s.length();i++){
      Character ch = s.charAt(i);
      if(ch != '#' ){
        stack.push(ch);
      }else{
        if(!stack.isEmpty()){
          stack.pop();
        }
      }
    }

    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }

    return sb.reverse().toString();
  }

  public static boolean backspaceCompareNotWorking(String s, String t) {
    char[] arr = s.toCharArray();
    int i = 0;
    StringBuilder sb = new StringBuilder(s);
    while(i<arr.length){
      if(arr[i] == '#'){
        sb.setCharAt(i-1,'\u0000');
      }
      i++;
    }

    char[] arrT = t.toCharArray();
    int i1 = 0;
    StringBuilder sb1 = new StringBuilder(s);
    while(i1<arrT.length){
      if(arrT[i1] == '#'){
        sb1.setCharAt(i1-1,'\u0000');
      }
      i1++;
    }

    return sb.toString() == sb1.toString();
  }
}
