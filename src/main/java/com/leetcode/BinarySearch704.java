package com.leetcode;

/*
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */
public class BinarySearch704 {

  public static void main(String[] args) {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;

    int index = findIndexUsingBS(nums, target);
    System.out.println(index);
  }

  private static int findIndexUsingBS(int[] nums, int target) {
    int first = 0, last = nums.length - 1;
    int mid;

    while (first <= last) {
      mid = (first + last) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      if (nums[mid] > target) {
        last = mid - 1;
      }

      if (nums[mid] < target) {
        first = mid + 1;
      }


    }

    return -1;
  }

}
