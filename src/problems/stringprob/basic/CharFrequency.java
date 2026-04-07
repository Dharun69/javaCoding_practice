package problems.stringprob.basic;

import java.util.*;

public class CharFrequency {

    // ✅ 1. Using HashMap (Optimal)
    public static void frequencyUsingHashMap(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // ✅ 2. Without HashMap (Using loops)
    public static void frequencyWithoutHashMap(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // process only first occurrence
            if (str.indexOf(ch) == i) {

                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " -> " + count);
            }
        }
    }

    public static void bruetForce(String s1) {
        for(int i=0; i<s1.length(); i++) {
            int count = 0;
            for(int j=0; j<s1.length(); j++) {
                if(s1.charAt(i) == s1.charAt(j)) {
                    count++;
                }
            }
            if(s1.indexOf(s1.charAt(i)) == i) {
                System.out.println(s1.charAt(i) +" =>" +count);
            }
        }
    }


    public static void main(String[] args) {
        String str = "stnrinsigghhnhuthh";

        System.out.println("Using HashMap:");
        frequencyUsingHashMap(str);

        System.out.println("\nWithout HashMap:");
        frequencyWithoutHashMap(str);

        bruetForce("dharunn");

    }
}
