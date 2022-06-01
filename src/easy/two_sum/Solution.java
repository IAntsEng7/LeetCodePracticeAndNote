package easy.two_sum;

public class Solution {
  public static int[] twoSum(int[] inputNum, int targetNum) {
    for (int i = 0; i < inputNum.length; i++) {
      for (int j = i + 1; j < inputNum.length; j++) {
        if (inputNum[j] == targetNum - inputNum[i]) {
          return new int[]{inputNum[i], inputNum[j]};
        }
      }
    }
    // if no number can add up to target value, then return value
    return null;
  }
}
