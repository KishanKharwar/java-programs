package com.ds.ashokit.recursion;

// (a) + (a + d) + (a + 2d) + ...(a + (n-1)d)
public class APSeries {

  public static void main(String[] args) {
    int n = 18;
    int a = 10;
    int d = 5;
    int sum = sumOfAPSeries(a,n,d);
    System.out.println(sum);
  }

  private static int sumOfAPSeries(int a, int n, int d) {
    if(n == 0 || n == 1){
      return a;
    }
    int sum = (a + (n-1)*d) + sumOfAPSeries(a,n-1,d);
    return  sum ;
  }
}
