package com.test.mohit.axyya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

  public static void main(String[] args) {
    //Stream.of("one","two","three","four","five").skip(2).forEach(System.out::println);

  }

  // split using space
  //split into chars
  // check if chars is + then
  public static String stringChallange(String str){
    String result = "true";

    if(str == null){
      return result;
    }

    String[] arr = str.split(" ");
    char[] arr1 = arr[0].toCharArray();
    char[] arr2 = arr[1].toCharArray();
    for(int i = 0;i<arr[0].length();i++){

      for(int j = i;j<arr2.length;j++){
        if(arr1[i] == '+'){
          Character ch = arr2[j];
          if(!((ch>=65 && ch <=90) || (ch>=97 && ch <=122) )){
            result = "false";
            break;
          }
        }
      }

    }


    return result;
  }
}

