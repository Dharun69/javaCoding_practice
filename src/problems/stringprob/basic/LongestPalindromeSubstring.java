package problems.stringprob.basic;

public class LongestPalindromeSubstring {

    public static String longestPalindrome(String str) {

        if (str.length() == 0) {
            return "";
        }

        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String substr = str.substring(i, j + 1);

                if (substr.length() > longest.length() && isPalindrome(substr)) {
                    longest = substr;
                }
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "Malayalam is a language";
        System.out.println("Longest substring which is a palindrome is: "
                + longestPalindrome(input));
    }
}
