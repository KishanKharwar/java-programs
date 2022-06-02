package com.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://www.hackerrank.com/contests/data-structures-beginner-to-expert/challenges/combination-sum1/problem
public class CombinationSum1SubsetsSum {

  public static void main(String[] args) {
    int[] arr = {35,44,80};
    HashSet<ArrayList<Integer>> list = subsets(arr);
    for(List<Integer> l : list){
      System.out.println(l);
    }
  }

  private static HashSet<ArrayList<Integer>> subsets(int[] arr) {
    HashSet<ArrayList<Integer>> set = new HashSet<>();
    subsets(set,new ArrayList<Integer>(),arr,0);
    return set;
  }

  private static void subsets(HashSet<ArrayList<Integer>> list, ArrayList<Integer> integers, int[] arr, int index) {
    list.add(new ArrayList<>(integers));
    for(int i = index;i<arr.length;i++){
      integers.add(arr[i]);
      subsets(list,integers,arr,i+1);
      integers.remove(integers.size()-1);
    }
  }
}
