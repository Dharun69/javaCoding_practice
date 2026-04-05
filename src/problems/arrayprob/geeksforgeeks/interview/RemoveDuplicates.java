package problems.arrayprob.geeksforgeeks.interview;

import java.util.*;

public class RemoveDuplicates {

    // Approach 1: Using a Set
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(); // preserves insertion order
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Convert set back to array
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }
        return result;
    }

    // Approach 2: Using a simple loop
    public static int[] removeDuplicates1(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Convert list back to array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // Approach 1
        int[] unique1 = removeDuplicates(arr);
        printArray(unique1); // Output: [1, 2, 3, 4, 5]

        // Approach 2
        int[] unique2 = removeDuplicates1(arr);
        printArray(unique2); // Output: [1, 2, 3, 4, 5]
    }
}