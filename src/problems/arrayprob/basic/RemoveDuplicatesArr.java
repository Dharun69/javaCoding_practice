package problems.arrayprob.basic;

import java.util.*;

public class RemoveDuplicatesArr {

    // Approach 1: Using Set
    public static String[] removeDuplicatesUsingSet(String[] arr) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr)); // maintains order
        return set.toArray(new String[0]);
    }

    // Approach 2: Using manual filter (indexOf equivalent)
    public static List<String> removeDuplicatesUsingFilter(String[] arr) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    // Approach 3: Using loop with contains
    public static List<String> removeDuplicatesUsingLoop(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String item : arr) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "avacado", "mango", "strawberry", "avacado", "mango"};

        // Approach 1
        String[] uniqueSet = removeDuplicatesUsingSet(arr);
        System.out.println("Unique values using Set: " + Arrays.toString(uniqueSet));

        // Approach 2
        List<String> uniqueFilter = removeDuplicatesUsingFilter(arr);
        System.out.println("Unique values using Filter: " + uniqueFilter);

        // Approach 3
        List<String> uniqueLoop = removeDuplicatesUsingLoop(arr);
        System.out.println("Unique values using Loop: " + uniqueLoop);
    }
}