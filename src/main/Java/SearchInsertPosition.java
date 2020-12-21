package main.Java;

import java.util.Arrays;

// Given a sorted array of distinct integers and a target value,
// return the index if the target is found.If not,
// return the index where it would be if it were inserted in order.
public class SearchInsertPosition {
  public static void main(String[] args) {
    System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
  }

//  public static int searchInsert(int[] arr, int target) {
//    return searchInsert(arr, target, 0, arr.length);
//  }
//
//  private static int searchInsert(int[] arr, int target, int low, int high) {
//    System.out.println(String.format("searchInsert(low = %d, high = %d)", low, high));
//    if (low >= high) {
//      System.out.println();
//      return -1;
//    }
//
//    int mid = (low + high) / 2;
//    if (arr[mid] == target) {
//      return mid;
//    } else if (target > arr[mid]) {
//      return searchInsert(arr, target, mid + 1, high);
//    } else {
//      return searchInsert(arr, target, low, mid);
//    }


  public static int searchInsert(int[] nums, int target) {
    int low = 0;
    System.out.println(low);

    int high = nums.length - 1;
    System.out.println("length of nums : " + nums.length);
    System.out.print("length of nums - 1 : ");
    System.out.println(+ nums.length - 1);

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
    System.out.print("inserted in index: ");
    return low;
  }
}
