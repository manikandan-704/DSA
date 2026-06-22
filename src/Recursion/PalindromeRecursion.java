package Recursion;

public class PalindromeRecursion {
    void main(String[] args) {
        int n=-6;
        System.out.println(isPalindrome(n));
    }
      int reverse = 0;
      public boolean isPalindrome(int n) {
            int original = Math.abs(n);
            reverseNumber(original);
            return original == reverse;
        }

        void reverseNumber(int n) {
            if (n == 0) return;

            reverse = reverse * 10 + n % 10;
            reverseNumber(n / 10);
        }
    }

