package com.test.hcl;




public class Main{

  public static void main(String[] args) {
    String s = "aabbcde";
    String res = stringChallange(s);
    System.out.println(res);
  }
  private static String stringChallange(String s ){
    int n = s.length();
    String encoded = "";
    String challange = "7qaeb62340";
    for(int i = 0;i<s.length();i++){
      int count = 1;
      while(i < (n-1) && s.charAt(i) == s.charAt(i + 1)){
        count++;
        i++;
      }
      encoded += count +""+ s.charAt(i);
    }

    StringBuilder sb = new StringBuilder(encoded);
    char[] arr = challange.toCharArray();
    String res = "";
    for(char ch : arr){
      encoded = encoded.replace(ch+"","");
    }

    return encoded;
  }

}
