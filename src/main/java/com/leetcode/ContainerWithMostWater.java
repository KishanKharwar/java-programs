package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

  public static void main(String[] args) {
    int[] heights = {1,8,6,2,5,4,8,3,7};
    int area = maxArea(heights);
    System.out.println(area);
  }

  public static int maxArea(int[] arr) {
    int maxArea = 0;

    int[] nextGreaterIndex = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    st.push(arr.length- 1);
    nextGreaterIndex[arr.length-1] = arr.length;

    for(int i = arr.length-2;i>=0;i--){
      while(!st.isEmpty()){
        while(!st.isEmpty() && arr[st.peek()] < arr[i]){
          nextGreaterIndex[i] = i;
          st.pop();
        }
        if(st.isEmpty()){
          nextGreaterIndex[i] = i;
        }else{
          nextGreaterIndex[i] = st.peek();
        }
        st.push(i);
      }
    }
    System.out.println(Arrays.toString(nextGreaterIndex));
    return maxArea;
  }

}
