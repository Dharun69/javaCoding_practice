package problems.stringprob.basic;
import java.util.*;

public class LongestUniqueSubstring {

    // Approach 1: Return length (Sliding window with Map)
    public static int lengthOfLongestUniqueSubstring(String str) {

        int maxLength = 0;
        int start = 0;

        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {

            char ch = str.charAt(end);

            if (charIndexMap.containsKey(ch)) {
                start = Math.max(charIndexMap.get(ch) + 1, start);
            }

            charIndexMap.put(ch, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    // ✅ Optimized Approach 2 (missing logic added)
    public static String longestUniqueSubstring(String str) {

        Set<Character> set = new HashSet<>();
        int left = 0;

        int maxLength = 0;
        int maxStart = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            // ✅ Only track length & start (no substring creation here)
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                maxStart = left;
            }
        }

        // ✅ Create substring only once
        return str.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {

        String input = "abcabcbb";

        System.out.println("Length: " + lengthOfLongestUniqueSubstring(input));
        System.out.println("Substring: " + longestUniqueSubstring(input));
    }
}