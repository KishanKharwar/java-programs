package com.ds.ashokit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestContinuousSubArray {

  public static void main(String[] args) {
    int[] arr = {3,-1,5,8,7,6,9,10,15,-2,-4,-3,17,16,18};
    int[] arr1 = {1,2,3,};
    Set<List<Integer>> intList = new HashSet<>();
    createSubArray(arr,intList);
    //System.out.println(intList);
    sortSubArray(intList);
   // System.out.println(intList);
    int maxLength = findMaxContinuousSubArray(intList);
    System.out.println(maxLength);
  }

  private static int findMaxContinuousSubArray(Set<List<Integer>> intSet){
    int maxLength = 0;
    for(List<Integer> l : intSet){
      int count = 1;
      for(int i = 0;i<l.size()-1;i++){
        if(l.get(i) + 1 == l.get(i+1)){
          count++;
          continue;
        }
        break;
      }
      maxLength = Math.max(maxLength,count);
    }
    return maxLength;
  }

  private static void sortSubArray(Set<List<Integer>> intSet) {
    for(List<Integer> l : intSet){
      Collections.sort(l);
    }
  }

  private static void createSubArray(int[] arr, Set<List<Integer>> intSet) {
    for(int i = 0;i< arr.length;i++){
      ArrayList<Integer> set = new ArrayList<>();
      for(int j = i;j< arr.length;j++){
        set.add(arr[j]);
        intSet.add(new ArrayList<>(set));
      }
    }
    System.out.println(intSet);
  }
}
