package com.hackerrank;

public class CubeRoot {

  public static void main(String[] args) {
    long num = 1221;
//    long root = printCubeRoot(num);
//    System.out.println(root);
    Double cubeRoot = cubeRoot(1331,0);
    System.out.println(cubeRoot.intValue());
  }

  private static long printCubeRoot(long num){
    long low = 1; long high = num;
    long mid = (low + high)/2;
    while(low <= high){
      mid = (low + high)/2;
      long pow = mid*mid*mid;
      if(pow == num){
        return mid;
      }else if(pow < num){
        low = mid + 1;
      }else if(pow > num){
        high = mid -1;
      }
    }

    return mid;
  }

  private static double cubeRoot(double N, int P) {
    double low = 1;
    double high = N;
    double prec = Math.pow(10, -P);
    double cuberoot = 1;
    while (low <= high) {
      double mid = (low + high) / 2;
      cuberoot = mid;

      // if the difference between cube of current mid and N is less than precision
      // value, then break.
      if (Math.abs(mid * mid * mid - N) <= prec)
        break;

        // decrementing high if answer lies between current low and mid
      else if (mid * mid * mid > N)
        high = mid;

        // incrementing low if answer lies between mid and current high.
      else
        low = mid;
    }
    return Math.round(cuberoot * Math.pow(10, P)) / Math.pow(10, P);
  }
}
