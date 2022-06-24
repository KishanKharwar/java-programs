package com.pepcoding.revision;

public class PowerLinear5 {

  public static void main(String[] args) {
    int x = 2;
    int n = 5;
    int res = power(x,n);
    System.out.println(res);
  }

  private static int power(int x, int n) {
    if(n == 0){
      return 1;
    }
    int xpnm1 = power(x,n-1);
    int xpn = x * xpnm1;
    return xpn;
  }
}
