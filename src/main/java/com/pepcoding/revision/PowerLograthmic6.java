package com.pepcoding.revision;

public class PowerLograthmic6 {

  public static void main(String[] args) {
    int x = 3;
    int n = 5;
    int pow = power(x,n);
    System.out.println(pow);
  }

  private static int power(int x, int n) {
    if(n == 0){
      return 1;
    }
    int xpnb2 = power(x,n/2);
    int xpn = xpnb2 * xpnb2;
    if(n % 2 != 0){
      xpn = x * xpn;
    }

    return xpn;
  }
}
