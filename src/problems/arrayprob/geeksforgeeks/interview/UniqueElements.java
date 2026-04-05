package problems.arrayprob.geeksforgeeks.interview;

import java.util.*;

public class UniqueElements {

    // Unique words using Set
    public static List<String> uniqueWords(String str) {
        String[] words = str.split(" ");
        Set<String> uniqueSet = new LinkedHashSet<>(Arrays.asList(words));
        return new ArrayList<>(uniqueSet);
    }

    // Unique words using array (manual check)
    public static List<String> uniqueWords1(String str) {
        String[] words = str.split(" ");
        List<String> uniqueList = new ArrayList<>();
        for (String word : words) {
            if (!uniqueList.contains(word)) {
                uniqueList.add(word);
            }
        }
        return uniqueList;
    }

    // Unique characters using Set
    public static List<Character> uniqueChars(String str) {
        Set<Character> uniqueSet = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            uniqueSet.add(c);
        }
        return new ArrayList<>(uniqueSet);
    }

    // Unique characters using array (manual check)
    public static List<Character> uniqueChars1(String str) {
        List<Character> uniqueList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (!uniqueList.contains(c)) {
                uniqueList.add(c);
            }
        }
        return uniqueList;
    }

    // Characters that appear exactly once using Map
    public static List<Character> uniqueCharsExactlyOnce(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Character> result = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (c != ' ' && freq.get(c) == 1) {
                result.add(c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "India is my Country";

        System.out.println("Unique words (Set): " + uniqueWords(str1));
        System.out.println("Unique words (manual): " + uniqueWords1(str1));

        System.out.println("Unique chars (Set): " + uniqueChars(str2));
        System.out.println("Unique chars (manual): " + uniqueChars1(str2));

        System.out.println("Chars appearing exactly once: " + uniqueCharsExactlyOnce(str2));
    }
}
