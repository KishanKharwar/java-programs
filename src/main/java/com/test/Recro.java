package com.test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Recro {
//  int b  = 0;
//  int a = b + 2;
  public static void main(String[] args) {
//    Recro r = new Recro();
//    System.out.println(r.a + "-"+  r.b);

    int[] arr = {1,2,3,4,5};
    //OptionalInt max = Arrays.stream(arr).max();
    //System.out.println(max.getAsInt());
    System.out.println(solve(arr.length,arr));
  }

  static int solve(int N , int[] A){
    int result = 0;

    for(int i = 0;i<N;i++) {
      if(Math.abs(A[i]) > Math.abs(result)) {
        result = A[i];
      }else if(Math.abs(result) == Math.abs(A[i]) && result > A[i]) {
        result = A[i];
      }
    }

    return  result;
  }
}
