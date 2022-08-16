package com.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TipTop {

  public static void main(String[] args) throws IOException {

    int arr[] = { 10, 2, -2, -20, 10 };
    int k = -10;
    int res = 0;
    for(int i = 0;i<arr.length;i++){
      int sum = 0;
      for(int j = i;j< arr.length;j++){
        sum += arr[j];
        if(sum == k){
          res++;
        }
      }
    }

    System.out.println(res);


//    int[] arr = {12,1,5,8,7,12,1,5,8};
//    int ans = 0;
//    for(int i :arr){
//      ans = i^ans;
//      System.out.println(ans);
//    }
//
//    System.out.println("Ans : "+ans);
//    File f = new File("abc.txt");
//    f.createNewFile();
//    System.out.println(f.getAbsolutePath());
//
//    File ne = new File(f.getAbsolutePath());
//    ne.createNewFile();

//    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//    long now = new Date().getTime();
//    System.out.println(formatter.format(now));
  }
}
