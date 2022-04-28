package com.ds.ashokit.programs;

import java.util.Stack;

public class ReverseElementUsingStack {

  public static void main(String[] args) {
    String str = "Shrashti teaches DSA";
    Stack<String> s1 = new Stack<>();

    String[] s = str.split(" ");
    for(int i = s.length-1;i>=0;i--){
      s1.push(s[i]);
    }

    for(String strs : s1){
      System.out.print(strs + " ");
    }

  }
}
