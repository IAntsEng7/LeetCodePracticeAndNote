package easy.two_sum;

import static easy.two_sum.Solution.twoSum;

import java.util.Arrays;

public class SolutionMain {
  public static void main(String[] args) {
    // Example 1.
    int[] inputNum = {2,7,11,15};
    int targetNum = 9;

    // Example 2.
    //    int[] inputNum = {3,2,4};
    //    int targetNum = 6;

    // Example 3.
    //    int[] inputNum = {3,3};
    //    int targetNum = 6;

    System.out.println(Arrays.toString(twoSum(inputNum, targetNum)));
  }
}
