package com.math;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 69;
        sumOfDigits(num);
    }

    private static void sumOfDigits(int num) {
        int sum = 0,rem = 0;
        while(num>0){
            rem = num % 10;
            sum +=rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
