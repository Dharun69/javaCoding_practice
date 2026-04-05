package problems.arrayprob.geeksforgeeks.easy;

import java.util.*;

public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Pick numbers that appear exactly twice
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates); // Output: [1, 2]
    }
}