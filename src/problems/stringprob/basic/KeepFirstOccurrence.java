package problems.stringprob.basic;

import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public class KeepFirstOccurrence {

    // Approach 1: Using Set
    public static void keepFirstOcc(String str) {

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Print Set
        System.out.println(set);

        // Convert Set to String
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        System.out.println(result.toString());
    }

    // Approach 2: Using Map
    public static void keepFirstOcc1(String str) {

        Map<Character, Boolean> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, true);
                result.append(ch);
            }
        }

        // Print using map keys
        StringBuilder fromMap = new StringBuilder();
        for (char ch : map.keySet()) {
            fromMap.append(ch);
        }

        System.out.println(fromMap.toString());
        System.out.println(result.toString());
    }

    // Approach 3: Without Set/Map
    public static void keepFirstOcc2(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        String input = "programming";

        keepFirstOcc(input);
        keepFirstOcc1(input);
        keepFirstOcc2(input);
    }
}