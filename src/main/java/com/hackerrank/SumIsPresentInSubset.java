package com.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;

public class SumIsPresentInSubset {

  public static void main(String[] args) {
    int size = 3;
    int sum = 79;
    int[] arr = {35,44,80};

    System.out.println(subsets(arr));

    boolean res = checkSubsetSum(arr);
    System.out.println(res);

  }

  private static boolean checkSubsetSum(int[] arr) {
    boolean res = true;

    return res;
  }

  private static HashSet<ArrayList<Integer>> subsets(int[] arr){
    HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
    ArrayList<Integer> temp;
    for(int i = 0;i<arr.length;i++){
      temp = new ArrayList<>();
      for(int j = i;j< arr.length;j++){
        temp.add(arr[j]);
        set.add(temp);
      }
    }

    return set;
  }
}
