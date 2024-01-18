package easy.remove_element_27;

public class Solution {
  public static int removeElement(int[] nums, int val) {

    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index++] = nums[i];
      }
    }
    return index;
  }

  public static void main(String[] args) {

    //    removeElement(new int[]{3,5,7,7,4}, 7);
    System.out.println("不相等的元素數量: " + removeElement(new int[] {7, 6, 3, 5, 7, 7, 4}, 7));
  }
}
