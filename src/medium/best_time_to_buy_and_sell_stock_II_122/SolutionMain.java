package medium.best_time_to_buy_and_sell_stock_II_122;

import static medium.best_time_to_buy_and_sell_stock_II_122.Solution1.maxProfit1;
import static medium.best_time_to_buy_and_sell_stock_II_122.Solution2.maxProfit2;

public class SolutionMain {
  public static void main(String[] args) {
    // Example 1: -> 7
    //    int[] prices = {7, 1, 5, 3, 6, 4};
    // Example 2: -> 4
    int[] prices = {1, 2, 3, 4, 5};
    // Example 3: -> 0
    //    int[] prices = {7, 6, 4, 3, 1};

    // Solution 1:
    System.out.println("Solution 1" + maxProfit1(prices));
    // Solution 2:
    System.out.println("Solution 2" + maxProfit2(prices));
  }
}
