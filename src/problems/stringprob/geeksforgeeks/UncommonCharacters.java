package problems.stringprob.geeksforgeeks;

import java.util.Set;
import java.util.TreeSet;

public class UncommonCharacters {

    public static void printUncommonCharacters(String s1, String s2) {

        StringBuilder result = new StringBuilder();

        // Characters in s1 not in s2
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (s2.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        // Characters in s2 not in s1
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (s1.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        // Remove duplicates and sort
        Set<Character> uniqueSorted = new TreeSet<>();
        for (int i = 0; i < result.length(); i++) {
            uniqueSorted.add(result.charAt(i));
        }

        // Print as string
        StringBuilder finalResult = new StringBuilder();
        for (char ch : uniqueSorted) {
            finalResult.append(ch);
        }

        System.out.println(finalResult.toString());
    }

    public static void main(String[] args) {
        String s1 = "swknwhkhhr";
        String s2 = "cgx";

        printUncommonCharacters(s1, s2); // Output: c g k n r s w x h
    }
}