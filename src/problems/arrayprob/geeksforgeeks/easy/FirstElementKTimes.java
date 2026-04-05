package problems.arrayprob.geeksforgeeks.easy;

import java.util.HashMap;

public class FirstElementKTimes {

    public static int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (freq.get(num) == k) {
                return num; // return first element that occurs k times
            }
        }

        return -1; // if no element occurs k times
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        System.out.println(firstElementKTime(arr, k));
        // Output: 7
    }
}