package easy.merge_sorted_array;

import java.util.Arrays;

public class Solution {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = 0;
    for (int i = m; i < m + n; i++) {
      nums1[i] = nums2[index++];
    }
    Arrays.sort(nums1);
//    System.out.println("Result: " + Arrays.toString(nums1));
  }

  public static void main(String[] args) {

    int[] nums1 = {1, 21, 3, 0, 0, 0};
    int[] nums2 = {28, 5, 6};

    merge(nums1, 3, nums2, 3);
  }
}
