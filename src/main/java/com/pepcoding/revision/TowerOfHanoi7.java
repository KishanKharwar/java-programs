package com.pepcoding.revision;

public class TowerOfHanoi7 {

  public static void main(String[] args) {
    int t1 = 1,t2 =2,t3 = 3;
    int n = 3;
    toh(n,t1,t2,t3);
  }
  //move from tower 1 to 2 using 3rd tower
  private static void toh(int n, int t1, int t2, int t3) {
    if(n == 0){
      return;
    }
    toh(n-1,t1,t3,t2);
    System.out.println( "Move "+ n + " from [" + t1 + " -> " + t2+"]");
    toh(n-1,t3,t2,t1);
  }
}
