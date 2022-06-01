package easy.two_sum;

public class Solution1 {
  public static int[] twoSum1(int[] inputNum, int targetNum) {
    for (int i = 0; i < inputNum.length; i++) {
      for (int j = i + 1; j < inputNum.length; j++) {
        if (inputNum[j] == targetNum - inputNum[i]) {
          //          return new int[] {inputNum[i], inputNum[j]}; // value of index number
          return new int[] {i, j}; // index number
        }
      }
    }
    // if no number can add up to target value, then return value
    return null;
  }
}
