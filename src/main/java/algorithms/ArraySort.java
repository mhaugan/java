package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
  private static int[] list = {5, 3, 10, 7, 20, 2, 25, 30};
  private static int pos = 6;
  private static List<Integer> integerList = Arrays.asList(10, 5, 3, 23, 11, 13, 9, 7);

  public static void main(String[] args) {
    System.out.println(min(list));
    System.out.println(minAtPos(list, pos));
    System.out.println(minAtPosImproved(integerList, pos));
  }


  public static int minAtPosImproved(List<Integer> list, int pos) {
    Collections.sort(list);
    return list.get(pos);
  }
  private static int minAtPos(int[] arr, int pos) {
    int temp = arr[pos];
    List<Integer> list = new ArrayList<>();
    for (int val : arr) {
      if (val < temp) {
        list.add(val);
      }
    }
    if (list.size() >= pos) {
      list.add(temp);
    }
    Collections.sort(list);
    return list.get(pos);
  }

  private static int min(int[] arr) {
    int min = arr[0];
    for (int val : arr) {
      if (val < min) {
        min = val;
      }
    }
    return min;
  }
}
