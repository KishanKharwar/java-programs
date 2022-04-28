package com.ds.ashokit.programs;

public class RadioStation {

  public static void main(String[] args) {
    int[] arr = {2, 11, 13, 15, 19, 21, 23, 25, 27}; //{9,2,2,4,2,2,2,2}
    int k = 2;

    int radio = noOfMinFrequencyToBePlaced(arr, k);
    System.out.println(radio);
  }

  private static int noOfMinFrequencyToBePlaced(int[] arr, int k) {
    int[] distanceArray = new int[arr.length - 1];

    for (int i = 0; i < arr.length - 1; i++) {
      distanceArray[i] = arr[i + 1] - arr[i];
    }
    int radio = 0;
    for (int i = 0; i < distanceArray.length; i++) {
      if (arr[i + 1] - arr[i] != k) {
        radio++;
      }
    }

    return radio;
  }
}
