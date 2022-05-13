package com.sde.sheet.day1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

  public static void main(String[] args) {
    int row = 5;
    //int col = 3;
    printPascalTriangle(row);
  }

  private static void printPascalTriangle(int numRows){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> pre = null, row = null;
    for(int i = 0;i<numRows;i++){
      row = new ArrayList<>();
      for(int j = 0;j<=i;j++){
        if(j == 0 || j == i){
          row.add(1);
        }else{
           row.add(pre.get(j-1) + pre.get(j));
        }
      }
      pre = row;
      res.add(row);
    }

    System.out.println(res);
  }
}
