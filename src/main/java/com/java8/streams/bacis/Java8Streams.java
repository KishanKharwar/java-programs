package com.java8.streams.bacis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

  public static void main(String[] args) {
//    List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//    System.out.println("Main List : " + myList);
//    List<Integer> evenList = findEven(myList);
//    System.out.println("Even List : "+evenList);

    //findNumbersStartingWith1(myList);
//    findDuplicate(myList);
//    findMax(myList);

    concatTwoList();
  }

  //Q #39) Write a Java 8 program to concatenate two Streams?
  private static void concatTwoList(){
    List<String> l1 = new ArrayList<>(Arrays.asList("a","b","c"));
    List<String> l2 = new ArrayList<>(Arrays.asList("d","e","f"));

    Stream<String> streams = Stream.concat(l1.stream(),l2.stream());
    streams.forEach(s -> System.out.print(s + " "));

  }

  //Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
  private static void findMax(List<Integer> myList) {
    long max = myList.stream().max(Integer::compare).get();
    System.out.println("Max : "+max);
  }

  //Q3 How to find duplicate elements in a given integers list in java using Stream functions?
  private static void findDuplicate(List<Integer> myList) {
    HashSet<Integer> set = new HashSet<>();
    myList.stream().filter(n-> !set.add(n)).forEach(System.out::println);
  }

  //Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
  private static List<Integer> findEven(List<Integer> myList) {
    return myList.stream().filter( i-> i%2 == 0).collect(Collectors.toList());
  }

  //Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
  private static void findNumbersStartingWith1(List<Integer> myList){
    myList.stream().map(n -> n + "").filter(n -> n.startsWith("1")).forEach(System.out::println);
  }


}
