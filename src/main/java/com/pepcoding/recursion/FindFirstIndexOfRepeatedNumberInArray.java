package com.pepcoding.recursion;

//https://www.youtube.com/watch?v=TU0xUG9eO3Y
public class FindFirstIndexOfRepeatedNumberInArray {

  public static void main(String[] args) {
    int[] arr = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4};
    int index = 0;
    int data = 3;
    int foundAtIndex = firstIndexOfOccurance(arr, index, data);
    System.out.println(foundAtIndex);
  }

  private static int firstIndexOfOccurance(int[] arr, int index, int data) {

    if (index == arr.length) {
      return -1;
    }

    if (arr[index] == data) {
      return index;
    } else {
      int idx = firstIndexOfOccurance(arr, index + 1, data);
      return idx;
    }
  }
}
