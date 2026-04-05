package problems.arrayprob.geeksforgeeks.basic;
import java.util.*;

public class UniqueElements {

    // Approach 1: Find element whose frequency is not a multiple of k
    public static int findUniqueElement(int k, int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() % k != 0) {
                return entry.getKey();
            }
        }

        return -1; // return -1 if no such element exists
    }

    // Approach 2: Find all elements that appear only once
    public static List<Integer> findUniqueNumbers(int[] arr) {
        List<Integer> uniqueNums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueNums.add(arr[i]);
            }
        }

        return uniqueNums;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 5, 2, 2, 6, 6};
        int k = 3;

        int uniqueElement = findUniqueElement(k, arr1);
        System.out.println("Element whose frequency is not multiple of " + k + ": " + uniqueElement);

        int[] arr2 = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> uniqueNumbers = findUniqueNumbers(arr2);
        System.out.println("Elements appearing only once: " + uniqueNumbers);
    }
}
