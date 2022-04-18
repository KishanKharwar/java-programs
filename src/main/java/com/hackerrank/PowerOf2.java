package com.hackerrank;

public class PowerOf2 {

  public static void main(String[] args) {
    long num = 8192;
    System.out.println(checkPowerOf2(num));
  }

  private static boolean checkPowerOf2(long num){
    boolean result = false;
    for(int i =0;i<32;i++){
      long data = getPower(2,i);
      if(data == num){
        result = true;
        break;
      }else if(num<data){
        break;
      }
    }

    return result;
  }

  private static long getPower(long x , int n){
    if(n == 0){
      return 1;
    }

    long xpnb2 = getPower(x, n/2);
    long pow = xpnb2 * xpnb2;

    if(n % 2 == 1){
      pow = pow * x;
    }

    return pow;

  }
}
