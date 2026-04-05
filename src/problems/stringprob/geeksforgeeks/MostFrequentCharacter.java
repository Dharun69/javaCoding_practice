package problems.stringprob.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static char mostFrequentChar(String str) {

        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char maxChar = '\0';
        int maxFreq = 0;

        // Find max frequency char
        for (char ch : freq.keySet()) {
            int count = freq.get(ch);

            if (count > maxFreq || (count == maxFreq && ch < maxChar)) {
                maxFreq = count;
                maxChar = ch;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("output")); // t
    }
}