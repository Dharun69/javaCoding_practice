package problems.arrayprob.basic;

import java.util.*;

public class PairSum {

    // Optimized approach using HashSet
    public static List<List<Integer>> findPairsOptimized(int[] array, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        Set<Integer> visitedNumbers = new HashSet<>();

        for (int num : array) {
            int complement = target - num;

            if (visitedNumbers.contains(complement)) {
                pairs.add(Arrays.asList(num, complement));
            }

            visitedNumbers.add(num);
        }

        return pairs;
    }

    // Brute-force nested loop approach
    public static List<List<Integer>> findPairsBruteForce(int[] array, int target) {
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    pairs.add(Arrays.asList(array[i], array[j]));
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 6, 8};
        int target = 10;

        List<List<Integer>> resultOptimized = findPairsOptimized(array, target);
        System.out.println("Optimized approach: " + resultOptimized);

        List<List<Integer>> resultBruteForce = findPairsBruteForce(array, target);
        System.out.println("Brute-force approach: " + resultBruteForce);
    }
}