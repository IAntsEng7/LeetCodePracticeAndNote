package easy.roman_to_integer_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static int romanToInt(String s) {

    HashMap<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);

    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      char currentSymbol = s.charAt(i);
      int currentValue = romanMap.get(currentSymbol);

      if (i < s.length() - 1) {
        char nextSymbol = s.charAt(i + 1);
        int nextValue = romanMap.get(nextSymbol);

        if (currentValue < nextValue) {
          result += (nextValue - currentValue);
          i++;
          continue;
        }
      }
      result += currentValue;
    }

    return result;
  }

  public static void main(String[] args) {

    romanToInt("MCMXCIV");
    System.out.println("Roman trans to Integer: " + romanToInt("MCMXCIV"));
  }
}
