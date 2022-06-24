package com.hackerrank;

public class FindFirstRepeatingCharacter {

  public static void main(String[] args) {
    String str = "datastructures";
    char ch = getFirstRepeatingChar(str);
    System.out.println(ch);
  }

  private static char getFirstRepeatingChar(String str){
    for(int i = 0;i<str.length()-1;i++){
      for(int j = i + 1;j<str.length();j++){
        if(str.charAt(i) == str.charAt(j)){
          return str.charAt(i);
        }
      }
    }
    return '.';
  }

}
