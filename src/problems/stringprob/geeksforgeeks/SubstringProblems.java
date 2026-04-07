package problems.stringprob.geeksforgeeks;
import java.util.*;

public class SubstringProblems {

    public static void main(String[] args) {
        String str = "abcaabcbb";

        printAllSubstrings(str);
        longestUniqueSubstring(str);
        countUniqueSubstrings(str);
        longestPalindromicSubstring(str);
        countSubstringsWithUniqueChars(str);
    }

    // 1. Print all substrings
    public static void printAllSubstrings(String str) {
        System.out.println("All Substrings:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
        System.out.println();
    }

    // 2. Longest substring without repeating characters (Sliding Window)
    public static void longestUniqueSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        String result = "";

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                result = str.substring(left, right + 1);
            }
        }

        System.out.println("Longest Unique Substring: " + result + " " + maxLength);
    }

    // 3. Count unique substrings
    public static void countUniqueSubstrings(String str) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        System.out.println("Total Unique Substrings: " + set.size());
    }

    // 4. Longest Palindromic Substring
    public static void longestPalindromicSubstring(String str) {
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);

                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longest);
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 5. Count substrings with all unique characters
    public static void countSubstringsWithUniqueChars(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < str.length(); j++) {
                if (set.contains(str.charAt(j))) break;

                set.add(str.charAt(j));
                count++;
            }
        }

        System.out.println("Substrings with all unique chars: " + count);
    }
}