package com.test.coderbyte;

public class PrintCountAndChars {

  public static void main(String[] args) {
    String s = "aabbcde";
    String res = stringChallange(s);
    System.out.println(res);
  }

  private static String stringChallange(String s ){
    int n = s.length();
    String encoded = "";

    for(int i = 0;i<s.length();i++){
      int count = 1;
      while(i < (n-1) && s.charAt(i) == s.charAt(i + 1)){
        count++;
        i++;
      }
      encoded += count +""+ s.charAt(i);
    }

    return encoded;
  }
}
