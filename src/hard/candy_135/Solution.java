package hard.candy_135;

import java.util.Arrays;

public class Solution {
  public static int candy(int[] ratings) {

    // 建立一個存放糖果數量的陣列
    int n = ratings.length;
    int[] candies = new int[n];

    // 初始化：都分配一顆糖果
    Arrays.fill(candies, 1);

    // 由左往右遍歷，確保右邊比左邊的分數高，若高則糖果數加一
    for (int i = 1; i < n; i++) {
      if (ratings[i] > ratings[i - 1]) {
        candies[i] = candies[i - 1] + 1;
      }
    }
//    System.out.println("Candy 1: " + Arrays.toString(ratings));
//    System.out.println("Candy 1: " + Arrays.toString(candies));

    // 由右往左遍歷，確保左邊比右邊分數高，若高且糖果數不比右邊多則糖果數更新為右邊加一
    for (int i = n - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        candies[i] = Math.max(candies[i], candies[i + 1] + 1);
      }
    }

//    System.out.println("Candy 2: " + Arrays.toString(ratings));
//    System.out.println("Candy 2: " + Arrays.toString(candies));

    System.gc();
    // 將所有糖果數加總
    int sum = 0;
    for (int candy : candies) {
      sum += candy;
    }

    return sum;
  }

  public static void main(String[] args) {

    System.out.println(candy(new int[] {1, 2, 87, 87, 87, 2, 1}));
  }
}
