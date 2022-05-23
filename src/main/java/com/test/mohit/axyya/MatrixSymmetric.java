package com.test.mohit.axyya;

import java.util.Arrays;

public class MatrixSymmetric {

  public static void main(String[] args) {
    String[] arr = {"5","0","<>","0","5"};
    //String[] arr = {"1","2","4" , "<>","2","1","1" , "<>","-4","1","-1"};
    String s = checkSymmetric(arr);
    System.out.println(s);
  }

  private static String checkSymmetric(String[] arr) {

    //int[] arr = new int[];

    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }

    String[] str = sb.toString().split("<>");
    int row = str[0].length();
    int col = str.length;
    if(row != col){
      return "not possible";
    }
    int[][] resA = new int[row][col];
    int j = 0,l = 0;
    boolean z = false;
    for(String s : str){
      char[] chars = s.toCharArray();
      z = false;
      l = 0;
      for(int i = 0;i<chars.length;i++){
        if(chars[i] == '-'){
          z = true;
          continue;
        }
        int a = Character.getNumericValue(chars[i]);
        if(z){
          resA[j][l] = -a;
        }else{
          resA[j][l] = a;
        }
        l++;
      }
      j++;
    }

    int[][] tr = new int[row][col];
    for(int i = 0;i<row;i++){
      for(int k = 0;k<col;k++){
        tr[k][i] = resA[i][k];
      }
    }
    boolean result = true;
    for(int i = 0;i<row;i++){
      for(int k = 0;k<col;k++) {
        if( resA[i][k] != tr[i][k]){
          result = false;
          break;
        }
      }
    }

    if(result){
      return "symmetric";
    }else{
      return "not symmetric";
    }
    //System.out.println(Arrays.toString(resA));

  }

  public static void display(int[][] matrix) {
    System.out.println("The matrix is: ");
    for(int[] row : matrix) {
      for (int column : row) {
        System.out.print(column + "    ");
      }
      System.out.println();
    }
  }
}
