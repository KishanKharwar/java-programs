package com.pepcoding.revision;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=Sa5PmCFF_zI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=25
public class GetAllSubSequence14 {

  public static void main(String[] args) {
    String str = "abc";
    ArrayList<String> res = getAllSubsequence(str);
    System.out.println(res);
  }

  private static ArrayList<String> getAllSubsequence(String str) {

    if(str.length() == 0){
      ArrayList<String> list = new ArrayList<>();
      list.add("");
      return list;
    }

    char ch = str.charAt(0);
    String rstr = str.substring(1);
    ArrayList<String> rlist = getAllSubsequence(rstr);
    ArrayList<String> resList = new ArrayList<>();
    for(String s : rlist){
      resList.add(""+s);
      resList.add(ch + s);
    }

    return resList;
  }
}
