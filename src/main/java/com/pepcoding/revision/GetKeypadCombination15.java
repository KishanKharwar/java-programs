package com.pepcoding.revision;

import java.util.ArrayList;

public class GetKeypadCombination15 {

  static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  public static void main(String[] args) {
    String str = "678";
    ArrayList<String> res = getAllKeyPadChars(str);
    System.out.println(res);
  }

  private static ArrayList<String> getAllKeyPadChars(String str) {

    if(str.length() == 0){
      ArrayList<String> l = new ArrayList<>();
      l.add("");
      return l;
    }

    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> rlist = getAllKeyPadChars(ros);
    ArrayList<String> res = new ArrayList<>();
    String code = arr[ch - '0'];
    for(int i = 0;i<code.length();i++){
      char c = code.charAt(i);
      for(String r : rlist){
        res.add(c + r);
      }
    }
    return res;
  }
}
