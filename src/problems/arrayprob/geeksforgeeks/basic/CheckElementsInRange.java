package problems.arrayprob.geeksforgeeks.basic;

import java.util.HashSet;
import java.util.Set;

public class CheckElementsInRange {

    public static boolean checkElements(int[] arr, int n, int A, int B) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // store all elements in a set for fast lookup
        }

        for (int i = A; i <= B; i++) {
            if (!set.contains(i)) {
                return false; // if any number in [A, B] is missing
            }
        }

        return true; // all numbers in range are present
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3};
        int n = 7;
        int A = 2;
        int B = 5;

        boolean result = checkElements(arr, n, A, B);
        System.out.println("All numbers from " + A + " to " + B + " are present: " + result);
    }
}