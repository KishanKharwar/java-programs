package com.test.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

  public static void main(String[] args) {

    Map<String,Integer> map = new HashMap<>();
    map.put("John",2);
    map.put("don",4);
    map.put("ran",26);

    map.forEach((name,clientid) -> System.out.println(name + " is " + clientid));

//    Student s = new Student();
//    Student s1 = new Student();
//    s.mark(s1);
//
    //closedPaths(649578);
    //closedPaths(1288);
//    // 0=1
//    4=1,6=1,9=1
//        8=2
  }
}

class Student {
  public void mark(Student s1){
    System.out.println(this==s1);
  }
}
//
//  void func(){
//    try{
//      String str = null;
//      System.out.println("1");
//      try{
//        System.out.println(str.length());
//      }catch (NullPointerException e){
//        System.out.println("inner");
//      }
//      System.out.println("2");
//    }catch (NullPointerException e){
//      System.out.println("outer");
//    }
//  }
//
//
//
//  static void java() {
//    try {
//      System.out.println("inside java ");
//      throw new RuntimeException("demo");
//    } finally {
//      System.out.println("java finally");
//    }
//  }
//
//  static void python() {
//    try {
//      System.out.println("inside python");
//      return;
//    } finally {
//      System.out.println("python finally");
//    }
//  }
//
//
//  static int closedPaths(int number) {
//    int max = 0;
//    int rem = 0;
//    while (number > 0) {
//      rem = number % 10;
//      if (rem == 0 || rem == 4 || rem == 6 || rem == 9) {
//        max++;
//      } else if (rem == 8) {
//        max = max + 2;
//      }
//      number = number / 10;
//    }
//    System.out.println(max);
//    return max;
//  }
//}
