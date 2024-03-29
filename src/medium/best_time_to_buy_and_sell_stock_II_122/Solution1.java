package medium.best_time_to_buy_and_sell_stock_II_122;

public class Solution1 {

  public static int maxProfit1(int[] prices) {
    return calculate(prices, 0);
  }

  public static int calculate(int[] prices, int s) {
    if (s >= prices.length) {
      return 0;
    }

    int max = 0;
    for (int start = s; start < prices.length; start++) {
      int maxProfit = 0;
      for (int i = start + 1; i < prices.length; i++) {
        if (prices[start] < prices[i]) {
          int profit = calculate(prices, i + 1) + prices[i] - prices[start];
          if (profit > maxProfit) {
            maxProfit = profit;
          }
        }
      }
      if (maxProfit > max) {
        max = maxProfit;
      }
    }
    return max;
  }
}
