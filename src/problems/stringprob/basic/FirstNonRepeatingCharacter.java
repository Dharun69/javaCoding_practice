package problems.stringprob.basic;

import java.util.*;

public class FirstNonRepeatingCharacter {

    // Approach 1: Brute Force
    public static void firstNonRepeatingCharBrute(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Brute: " + str.charAt(i));
                return;
            }
        }
        System.out.println("Brute: No non-repeating character");
    }

    // Approach 2: Using Map (Optimized)
    public static void firstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("Map: " + str.charAt(i));
                return;
            }
        }

        System.out.println("Map: No non-repeating character");
    }

    public static void main(String[] args) {

        String input = "automation";

        firstNonRepeatingCharBrute(input);
        firstNonRepeatingChar(input);
    }
}