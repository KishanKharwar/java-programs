package com.math;

public class SquareSum {
    public static void main(String[] args) {
        int num = 15;
        findSquareSum(num);
    }

    private static void findSquareSum(int num) {
        int formla = num * (num + 1) * (2 * num + 1) / 6;
        System.out.print(formla + " ");
    }
}
