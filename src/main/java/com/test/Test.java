package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {
    int n = 37;

    if((n % 33 == 0 ^ 37 == 0)){
      System.out.println("Hi");
    }else{
      System.out.println("no");
    }

//    String n = "Kishan Kumar Kharwar";
//     Map<String,Long> collect;
//    collect = n.codePoints().filter(c -> c != ' ' ).mapToObj(c -> Character.toString((char)c)).collect(Collectors.groupingBy(
//        Function.identity(),Collectors.counting()));
//
//    System.out.println(collect);





//    List<String> names = new ArrayList<>(Arrays.asList("Kishan","Ashish","Ram","Love","Kush"));
//
//    names.stream().filter( n -> n.contains("a") || n.contains("A"))
//        .map(n -> n.toUpperCase())
//        .forEach(System.out :: println);


//    int[] arr = {12, 23, 35, 1, 5, 8};
//    int max = 0;
//    int secondMax = 0;
//
//    for (int i : arr) {
//      if(max < i){
//        max = i;
//      }
//    }
//
//    for(int i : arr){
//      if(i != max){
//        if (secondMax < i) {
//          secondMax = i;
//        }
//      }
//    }
//    System.out.println(secondMax);
  }


}
