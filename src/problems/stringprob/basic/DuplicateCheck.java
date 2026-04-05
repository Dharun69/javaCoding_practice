package problems.stringprob.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCheck {

    // Approach 1: Using Map
    public static boolean hasDuplicate(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int value : map.values()) {
            if (value > 1) {
                return true;
            }
        }

        return false;
    }

    // Approach 2: Using Set (optimized)
    public static boolean hasDuplicate1(String str) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (set.contains(ch)) {
                return true;
            }

            set.add(ch);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(hasDuplicate("hello"));   // true
        System.out.println(hasDuplicate("abcde"));   // false

        System.out.println(hasDuplicate1("hello"));  // true
        System.out.println(hasDuplicate1("abcde"));  // false
    }
}