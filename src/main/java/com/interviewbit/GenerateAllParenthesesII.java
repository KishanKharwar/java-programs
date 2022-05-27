package com.interviewbit;

import java.util.Arrays;

public class GenerateAllParenthesesII {

  public static void main(String[] args) {
    int n = 4;
    String[] arr = new String[n*2];
    int index = 0,open = 0,close=0;
    String[] res = generateParenthesis(n,arr,index,open,close);
    for(String s : res){
      System.out.println(s);
    }
  }

  public static String[] generateParenthesis(int n, String[] arr, int index, int open, int close) {
    if(index == arr.length){
      return arr;
    }

    if(open<n){
      arr[index] = "(";
      generateParenthesis(n,arr,index + 1,open+1,close);
    }

    if(open>close){
      arr[index] = ")";
      generateParenthesis(n,arr,index + 1,open,close+1);
    }

    return arr;
  }

  public static void generateParenthesisII(int n, char[] arr, int index, int open, int close) {
    if(index == arr.length){
      System.out.println(Arrays.toString(arr));
    }

    if(open<n){
      arr[index] = '(';
      generateParenthesisII(n,arr,index + 1,open+1,close);
    }

    if(open>close){
      arr[index] = ')';
      generateParenthesisII(n,arr,index + 1,open,close+1);
    }

  }
}
