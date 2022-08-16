package com.test.ust;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {

   // Optional<Employee> emp = empList.streams().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));


    int i = 11;
    int a = i++ + ++i;
    System.out.println(a);

//    HashMap<String,String> map = new HashMap<>();
//    map.put("nikhil","raj");
//    map.put("kishan","kharwar");

//    System.exit(0);
//    try{
//
//    }finally {
//      System.out.println("Finally called");
//    }


//    String str1 = "cat";
//    String str2 = "act";
//
//    boolean checkAnagram = checkAnagram(str1,str2);
//    System.out.println("Strings are anagram ? " + checkAnagram);
  }

  private static boolean checkAnagram(String str1, String str2) {
    if(str1 == null || str2 == null){
      return false;
    }
    if(str1.length() != str2.length()){
      return false;
    }
    char[] arr1 = str1.toCharArray();
    Arrays.sort(arr1);
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr2);

    for(int i = 0;i<arr1.length;i++){
      if(arr1[i] != arr2[i]){
        return false;
      }
    }

    return true;
  }
}
