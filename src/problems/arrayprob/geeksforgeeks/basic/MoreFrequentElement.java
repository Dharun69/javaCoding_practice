package problems.arrayprob.geeksforgeeks.basic;
import java.util.HashMap;
import java.util.Map;

public class MoreFrequentElement {

    // Approach 1: Simple counting
    public static int moreFrequent(int[] arr, int x, int y) {
        int countX = 0, countY = 0;
        for (int num : arr) {
            if (num == x) countX++;
            else if (num == y) countY++;
        }

        if (countX > countY) return x;
        else if (countY > countX) return y;
        else return Math.min(x, y);
    }

    // Approach 2: Using HashMap
    public static int moreFrequentUsingMap(int[] arr, int x, int y) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of all elements
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int countX = freq.getOrDefault(x, 0);
        int countY = freq.getOrDefault(y, 0);

        if (countX > countY) return x;
        else if (countY > countX) return y;
        else return Math.min(x, y);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 4, 4,4, 5};
        int x = 4, y = 5;

        System.out.println("More frequent (simple count): " + moreFrequent(arr, x, y));
        System.out.println("More frequent (using HashMap): " + moreFrequentUsingMap(arr, x, y));
    }
}