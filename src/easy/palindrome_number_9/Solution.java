package easy.palindrome_number_9;

public class Solution {
  public static boolean isPalindrome(int x) {

    if (x < 0) { // 如果x是負數，則一定不是回文數
      return false;
    }

    int original = x;
    int palindrome = 0;

    while (x != 0) {
      int digit = x % 10;
      palindrome = palindrome * 10 + digit;
      x /= 10;
    }

    System.out.println("original: " + original);
    System.out.println("palindrome: " + palindrome);

    return original == palindrome;
  }

  public static void main(String[] args) {

    System.out.println("Is the number palindrome? Ans: " + isPalindrome(1991));
  }
}
