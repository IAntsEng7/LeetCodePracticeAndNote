package medium.remove_duplicates_from_sorted_array_ii_80;

public class Solution {

  public static int removeDuplicates(int[] nums) {

    if (nums.length < 2) {
      return nums.length; // 如果長度小於2就沒有需要算
    }

    int index = 2;
    for (int i = 2; i < nums.length; i++) {
      if (nums[i] != nums[index - 2]) {
        nums[index++] = nums[i];
      }
    }
    // 從第三個元素開始檢查，如果當前元素不等於當前陣列索引-2的時候代表遇到新的元素，加入結果陣列
    return index;
  }

  public static void main(String[] args) {

    System.out.println(removeDuplicates(new int[] {1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 7, 9}));
  }
}
