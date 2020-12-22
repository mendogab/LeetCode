package main.Java;

import java.util.Arrays;

// Given a sorted array of distinct integers and a target value,
// return the index if the target is found.If not,
// return the index where it would be if it were inserted in order.
public class SearchInsertPosition {
  public static void main(String[] args) {
    System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
  }

  public static int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while( low <= high ){
      int mid = ( low + high ) / 2;
      if( nums[mid] == target ){
        return mid;
      }else if( nums[mid] < target ){
        low = mid + 1;
      }else{
        high = mid - 1;
      }
    }
    System.out.print("Target not found, should be inserted at index: ");
    return low;
  }
}
