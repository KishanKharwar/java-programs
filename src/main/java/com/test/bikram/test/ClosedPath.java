package com.test.bikram.test;

public class ClosedPath {
//0,4,6,9 -1
  // 8 -2
  public static void main(String[] args) {
    int num = 649578;
    int paths = closedPath(num);
    System.out.println(paths);
  }

  private static int closedPath(int num) {
    int rem = 0;
    int sum =0;
    while(num>0){
      rem = num % 10;

      if(rem == 0 || rem == 4 || rem == 6 || rem == 9){
        sum += 1;
      }else if(rem == 8){
        sum += 2;
      }
      num = num/10;
    }
    return sum;
  }
}
