package problems.stringprob.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstRepeatingChar {

    public static char firstRepeatingCh(String str) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (set.contains(ch)) {
                return ch;
            }

            set.add(ch);
        }

        return '\0'; // if no repeating character
    }

    public static void firstRepeatingChUsingMap(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // Find first repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) > 1) {
                System.out.println("First Repeating char: " + ch);
                return;
            }
        }

    }


    public static void firstRepeatingChUsingLinkedMap(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char key :map.keySet()) {
            if(map.get(key) == 2) {
                System.out.println("First Repeating char: " + key);
                return;
            }
        }

    }


    public static void main(String[] args) {
        char result = firstRepeatingCh("programming");

        if (result != '\0') {
            System.out.println("First Repeating Character: " + result);
        } else {
            System.out.println("No repeating character found");
        }

        firstRepeatingChUsingMap("programming");
        firstRepeatingChUsingLinkedMap("programming");
    }
}