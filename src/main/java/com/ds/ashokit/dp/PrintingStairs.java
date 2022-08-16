package com.ds.ashokit.dp;

import java.util.ArrayList;

public class PrintingStairs {

  public static void main(String[] args) {
    int n = 6;
//    int num = countStairsRecursion(n);
//    int num = countStairPathMemoization(n, new int[n +1]);
    int num = countStairPathTab(n);
    System.out.println("Stairs count : "+num);

//    ArrayList<String> paths = printStairPath(n);
//    paths.forEach(path -> {
//      System.out.println(path);
//    });
//    System.out.println("Total Path : " + paths.size());
  }

  private static int countStairPathTab(int n){
    int dp[] = new int[n + 1];

    dp[0] = 1;

    for(int i = 1;i<=n;i++){
      if(i == 1){
        dp[i] = dp[i-1];
      }
      else if (i == 2){
        dp[i] = dp[i-1] + dp[i-2];
      }else{
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
      }
    }
    return dp[n];
  }

  private static int countStairPathMemoization(int n, int[] dp) {
    if(n == 0){
      return 1;
    }

    if(n <0){
      return 0;
    }

    if(dp[n] != 0){
      return dp[n];
    }
    System.out.print(n + " ");
    int p1 = countStairPathMemoization(n-1,dp);
    int p2 = countStairPathMemoization(n-2,dp);
    int p3 = countStairPathMemoization(n-3,dp);

    int tp = p1 + p2 + p3;
    dp[n] = tp;
    return tp;
  }


  private static int countStairsRecursion(int n) {
    if(n == 0){
      return 1;
    }

    if(n < 0){
      return 0;
    }

    int p1 = countStairsRecursion(n-1);
    int p2 = countStairsRecursion(n-2);
    int p3 = countStairsRecursion(n-3);

    int p = p1 + p2+ p3;
    return p;
  }

  private static ArrayList<String> printStairPath(int n) {
    if(n == 0){
      ArrayList<String> l1 = new ArrayList<>();
      l1.add("");
      return l1;
    }

    if(n <0){
      ArrayList<String> l1 = new ArrayList<>();
      return l1;
    }

    ArrayList<String> path1 = printStairPath(n-1);
    ArrayList<String> path2 = printStairPath(n-2);
    ArrayList<String> path3 = printStairPath(n-3);

    ArrayList<String> res = new ArrayList<>();
    for(String s : path1){
      res.add(1 + s);
    }

    for(String s : path2){
      res.add(2 + s);
    }
    for(String s : path3){
      res.add(3 + s);
    }

    return res;
  }
}
