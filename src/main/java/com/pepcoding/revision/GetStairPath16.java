package com.pepcoding.revision;

import java.util.ArrayList;

public class GetStairPath16 {

  public static void main(String[] args) {
    int n = 4;
    ArrayList<String> list = getStairPath(n);
    System.out.println(list);
  }

  private static ArrayList<String> getStairPath(int n) {

    if(n == 0){
      ArrayList<String> l = new ArrayList<>();
      l.add("");
      return l;
    }else if(n <0){
      ArrayList<String> l = new ArrayList<>();
      return l;
    }

    ArrayList<String> path1 = getStairPath(n-1);
    ArrayList<String> path2 = getStairPath(n-2);
    ArrayList<String> path3 = getStairPath(n-3);

    ArrayList<String> res = new ArrayList<>();

    for(String p1 : path1){
      res.add(1 + p1);
    }

    for(String p2 : path2){
      res.add(2 + p2);
    }

    for(String p3 : path3){
      res.add(3 + p3);
    }

    return res;
  }
}
