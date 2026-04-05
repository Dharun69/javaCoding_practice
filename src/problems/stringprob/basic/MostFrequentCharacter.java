package problems.stringprob.basic;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static char mostFrequentCharacter(String str) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = '\0';
        int maxCount = 0;

        // Find max occurring character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {

        String str = "aabbbcccaa";
        System.out.println("Maximum repeating character is: " + mostFrequentCharacter(str));
    }
}