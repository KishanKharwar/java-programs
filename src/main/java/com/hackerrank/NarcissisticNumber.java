package com.hackerrank;

import java.util.Arrays;

/*
A narcissistic number is a number that is the sum of its own
digits each raised to the power of the number of digits

num = 8208
 8^4 + 2^4 + 0^4 + 8^4 = 8208,8208==8208
 */
public class NarcissisticNumber {

  public static void main(String[] args) {
    int num = 8208;

    boolean result = checkNarcssist(num);
    System.out.println(result);
  }

  private static boolean checkNarcssist(int num) {
    int count = countChars(num);
    System.out.println(count);

    int[] arr = new int[count];

    splitNumbers(num,arr);
    System.out.println(Arrays.toString(arr));

    int result = 0;
    for (int j = 0; j < arr.length; j++) {
      result = result + findPower(arr[j], count);
    }

    System.out.println(result);
    if(result == num){
      return true;
    }
    return false;
  }

  private static void splitNumbers(int num, int[] arr) {
    int i = 0;
    int rem = 0;
    int num1 = num;
    while (num1 > 0) {
      rem = num1 % 10;
      arr[i] = rem;
      num1 = num1 / 10;
      i++;
    }
    return;
  }

  private static  int countChars(int number){
    int count = 0;
    while (number > 0) {
      number = number / 10;
      count++;
    }
    return count;
  }

  private static int findPower(int num, int count) {
    if(count == 0){
      return 1;
    }

    int npnb2 = findPower(num,count/2);
    if(count % 2 == 0){
      return npnb2 * npnb2;
    }else {
      return num * npnb2 * npnb2;
    }

  }
}
