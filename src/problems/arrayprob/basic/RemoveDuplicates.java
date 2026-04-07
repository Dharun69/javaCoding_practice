package problems.arrayprob.basic;

import java.util.*;

public class RemoveDuplicates {

    // 1️⃣ Using Set
    public static Integer[] removeDuplicatesUsingSet(Integer[] arr) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr)); // maintains order
        return set.toArray(new Integer[0]);
    }

    // 2️⃣ Using loop with contains
    public static List<Integer> removeDuplicatesUsingLoop(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : arr) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void removeDup(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        System.out.println("Using set " + set);
    }


    public static void main(String[] args) {
        Integer[] originalArray = {1, 2, 3, 4, 4, 5, 6, 6};

        // Approach 1
        Integer[] uniqueArraySet = removeDuplicatesUsingSet(originalArray);
        System.out.println("Unique array using Set: " + Arrays.toString(uniqueArraySet));

        // Approach 2
        List<Integer> uniqueArrayLoop = removeDuplicatesUsingLoop(originalArray);
        System.out.println("Unique array using loop: " + uniqueArrayLoop);

        // Approach 3
        int[] input = {1, 2, 3, 4, 4, 5, 6, 6};
        removeDup(input);
    }
}