package main.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
  public static void main(String[] args) {
    System.out.println(mergeSort(
        new ArrayList<>(Arrays.asList(3, 1, 8, 4, 9))
    ));
  }

  public static List<Integer> mergeSort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    }

    int mid = list.size() / 2;
    List<Integer> left = list.subList(0, mid);
    List<Integer> right = list.subList(mid,list.size());

    left = mergeSort(left);
    right = mergeSort(right);

    return mergeSortedList(left, right);
  }

  public static List<Integer> mergeSortedList(List<Integer> a, List<Integer> b) {
    List<Integer> tempArray = new ArrayList<Integer>();
    int ptrA = 0;
    int ptrB = 0;

    while(ptrA < a.size() && ptrB < b.size()) {
      if (a.get(ptrA) < b.get(ptrB)) {
        tempArray.add(a.get(ptrA));
        ptrA++;
      } else {
        tempArray.add(b.get(ptrB));
        ptrB++;
      }
    }

    while (ptrA < a.size()) {
      tempArray.add(a.get(ptrA));
      ptrA++;
    }

    while (ptrB < b.size()) {
      tempArray.add(b.get(ptrB));
      ptrB++;
    }
    return tempArray;
  }
}
