package com.ds.ashokit;

public class AreaOfHistogram {

  public static void main(String[] args) {
    int[] arr = {2,1,5,4,7,6,2,3,10,8,5,6,4,7,2,3};

    int maxArea = intMaxArea(arr);
    System.out.println(maxArea);
  }

  private static int intMaxArea(int[] arr) {

    int max = arr[0];
    for(int i=1;i<arr.length;i++){
      int j = i-1, k=i+1;
      while(j>=0 && arr[j]>=arr[i]){ //i=1, 2<1, j=-1
        j--;
      }
      while(k<arr.length && arr[k]>=arr[i]){
        k++;
      }

      if(j == -1)
        j = 0;
      if(k == arr.length)
        k = arr.length-1;
      int len = k-j + 1;
      max = Math.max(max,len*arr[i]);
    }

    return max;
  }
}
