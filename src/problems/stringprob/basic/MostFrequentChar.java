package problems.stringprob.basic;

import java.util.HashMap;

public class MostFrequentChar {

    // ================================
    // Version 1: Using HashMap
    // ================================
    public static char countCharactersMap(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find max
        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (char ch : freq.keySet()) {
            if (freq.get(ch) > maxCount) {
                maxCount = freq.get(ch);
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }

    // ================================
    // Version 2: Brute Force (nested loops)
    // ================================
    public static char countCharactersBruteForce(String str) {
        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Count occurrences of ch
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // Update maxCount and mostFrequentChar
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }

    // ================================
    // Main Method for Testing
    // ================================
    public static void main(String[] args) {
        String name1 = "poojitha";

        System.out.println("Most frequent char (Map): " + countCharactersMap(name1));
        System.out.println("Most frequent char (Brute Force): " + countCharactersBruteForce(name1));
    }
}