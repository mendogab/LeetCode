package main.Java;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(binarySearch(new int[]{1, 2, 5, 6, 8, 10}, 5));
  }

  public static int binarySearch(int[] arr, int target) {
    return binarySearch(arr, target, 0, arr.length);
  }

  private static int binarySearch(int[] arr, int target, int low, int high) {
    System.out.println(String.format("binarySearch(low = %d, high = %d)", low, high));
    if (low >= high) {
      return -1;
    }
    int mid = (low + high) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (target > arr[mid]) {
      return binarySearch(arr, target, mid + 1, high);
    } else {
      return binarySearch(arr, target, low, mid);
    }
  }

}
