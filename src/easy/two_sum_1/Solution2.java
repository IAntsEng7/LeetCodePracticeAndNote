package easy.two_sum_1;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
  public static int[] twoSum2(int[] inputNum, int targetNum) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < inputNum.length; i++) {
      int addUpToTarget = targetNum - inputNum[i];
      if (map.containsKey(addUpToTarget)) {
        return new int[] {map.get(addUpToTarget), i};
      }
      map.put(inputNum[i], i);
    }
    // if no number can add up to target value, then return value
    return null;
  }
}
