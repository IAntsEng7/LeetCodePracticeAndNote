package easy.remove_duplicates_from_sorted_array_26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static int removeDuplicates(int[] nums) {

    int index = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i == 0 || nums[i] > nums[i - 1]) {
        nums[index++] = nums[i];
      }
    }

    return index;
  }

  public static void main(String[] args) {

    //    removeDuplicates(new int[] {1, 1, 3, 4, 5, 5, 7});
    System.out.println(removeDuplicates(new int[] {1, 1, 3, 4, 5, 5, 7}));
    System.out.println(removeDuplicatesByUsingSet(new int[] {1, 1, 3, 4, 5, 5, 7}));
  }

  public static int removeDuplicatesByUsingSet(int[] nums) {

    Set<Integer> uniqueSet = new HashSet<>();
    int index = 0;

    for (int i = 0; i < nums.length; i++) {
      if (uniqueSet.add(nums[i])) {
        nums[index++] = nums[i];
      }
    }

    return index;
  }
}
