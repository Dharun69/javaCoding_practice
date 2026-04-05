package problems.stringprob.geeksforgeeks;

import java.util.HashSet;
import java.util.Set;

public class MaxUniqueSubstring {

    public static String findMaxUniqueSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Set<Character> charSet = new HashSet<>();
        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);
            // Remove characters until currentChar is unique in the window
            while (charSet.contains(currentChar)) {
                charSet.remove(str.charAt(start));
                start++;
            }
            charSet.add(currentChar);
            // Update max length and starting index
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }
        return str.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = findMaxUniqueSubstring(input);
        System.out.println("Max length unique substring is: " + result); // Output: abc
    }
}