package problems.stringprob.geeksforgeeks;
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static String findLargestNonRepetitiveSubstring(String str) {
        int n = str.length();
        Set<Character> charSet = new HashSet<>();
        int start = 0, end = 0;
        int maxLength = 0;
        int maxStart = 0; // To remember starting index of max substring

        while (end < n) {
            char currentChar = str.charAt(end);

            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar);
                end++;

                if (end - start > maxLength) {
                    maxLength = end - start;
                    maxStart = start;
                }
            } else {
                charSet.remove(str.charAt(start));
                start++;
            }
        }

        // Extract the longest unique substring
        return str.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Largest non-repetitive substring: " + findLargestNonRepetitiveSubstring(input));
        // Output: abc
    }
}

