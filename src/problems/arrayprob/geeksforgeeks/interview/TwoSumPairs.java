package problems.arrayprob.geeksforgeeks.interview;

import java.util.Arrays;

public class TwoSumPairs {

    public static void twoSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array first
        int left = 0;
        int right = arr.length - 1;

        System.out.print("Pairs: ");
        boolean first = true; // for formatting

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                if (!first) System.out.print(", ");
                System.out.print("[" + arr[left] + ", " + arr[right] + "]");
                first = false;

                // skip duplicates for left
                int currentLeft = arr[left];
                while (left < right && arr[left] == currentLeft) left++;

                // skip duplicates for right
                int currentRight = arr[right];
                while (left < right && arr[right] == currentRight) right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 6, 8};
        int target = 10;
        twoSum(arr, target);
    }
}
