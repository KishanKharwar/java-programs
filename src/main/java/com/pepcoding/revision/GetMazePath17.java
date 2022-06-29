package com.pepcoding.revision;

import java.util.ArrayList;

public class GetMazePath17 {

  public static void main(String[] args) {
    int n = 3;
    int m = 3;
    ArrayList<String> list = getMazePaths(1,1,n,m);
    System.out.println(list);
  }

  private static ArrayList<String> getMazePaths(int sr, int sc, int n, int m) {

    if(sr == n && sc == m){
      ArrayList<String> l = new ArrayList<>();
      l.add("");
      return l;
    }

    ArrayList<String> hpath = new ArrayList<>();
    ArrayList<String> vpath = new ArrayList<>();
    if(sr < n){
      hpath = getMazePaths(sr + 1,sc,n,m);
    }

    if(sc<m){
      vpath = getMazePaths(sr,sc+1,n,m);
    }

    ArrayList<String> res = new ArrayList<>();
    for(String p1 : hpath){
      res.add("h" + p1);
    }

    for(String p2 : vpath){
      res.add("v" + p2);
    }

    return res;
  }
}
