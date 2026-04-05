package problems.arrayprob.geeksforgeeks.basic;

public class PalindromeArray {

    // Check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    // Check if all numbers in the array are palindromes
    public static boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {111, 2212, 333, 444, 555};
        System.out.println("All numbers are palindrome? " + isPalinArray(arr));
    }
}

