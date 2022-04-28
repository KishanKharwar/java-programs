package com.ds.ashokit.recursion;

import java.util.Arrays;

public class BalancedParenthesisUsingRecursion {

  public static void main(String[] args) {
    int n = 1;
    char[] ch = new char[n * 2];
    int index = 0;
    int open = 0;
    int close = 0;
    printParenthesis(n, ch, index, open, close);
  }

  private static void printParenthesis(int n, char[] ch, int index, int open, int close) {
    if(index == ch.length){
      System.out.println(Arrays.toString(ch));
    }

    if(open<n){
      ch[index] = '(';
      printParenthesis(n,ch,index + 1, open + 1, close);
    }

    if(close < open){
      ch[index] = ')';
      printParenthesis(n,ch,index+1,open,close+1);
    }
  }

}
