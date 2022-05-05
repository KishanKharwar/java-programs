package com.ds.ashokit.recursion;

import java.util.Arrays;
import java.util.List;

public class FindStringInArray {

  public static void main(String[] args) {
    String[] arr = {"ASHOK","IT", "AS","HOK","I","T", "A","SHO"};
    String str = "ASHOKIT";
    List<String> list = Arrays.asList(arr);
    int index = 0;
    boolean result = findString(list,str,index);
    System.out.println(result);

    int noOfPermutations = findStringCount(list,str,0);
    System.out.println("No of times : "+noOfPermutations);
  }

  private static boolean findString(List<String> list, String str, int i) {
    if(i == str.length()){
      return true;
    }

    for(int j=i;j<=str.length();j++){
      String temp = str.substring(i,j);
      //System.out.println(temp);
      if(list.contains(temp)){
        //int idx = j;
        if(findString(list,str,j)){
          return true;
        }
      }
    }
    return false;
  }

  private static int findStringCount(List<String> list, String str, int i) {
    int count = 0;
    if(i == str.length()){
      return 1;
    }

    for(int j=i;j<=str.length();j++){
      String temp = str.substring(i,j);
      if(list.contains(temp)){
        System.out.println(temp + " - " + count);
        count += findStringCount(list,str,j);
      }
    }
    return count;
  }


}
