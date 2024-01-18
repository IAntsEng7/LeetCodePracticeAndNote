package easy.two_sum_1;

import static easy.two_sum_1.Solution1.twoSum1;
import static easy.two_sum_1.Solution2.twoSum2;

import java.util.Arrays;

public class SolutionMain {
  public static void main(String[] args) {
    // Example 1.
    //    int[] inputNum = {2, 7, 11, 15};
    //    int targetNum = 9;

    // Example 2.
    //    int[] inputNum = {3, 2, 4};
    //    int targetNum = 6;

    // Example 3.
    int[] inputNum = {3, 3};
    int targetNum = 6;

    System.out.println(
        "Solution 1 index number is : " + Arrays.toString(twoSum1(inputNum, targetNum)));
    System.out.println(
        "Solution 2 index number is : " + Arrays.toString(twoSum2(inputNum, targetNum)));
  }
}
