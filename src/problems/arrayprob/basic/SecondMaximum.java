package problems.arrayprob.basic;

import java.util.Arrays;

public class SecondMaximum {

    // Approach 1: Using sorting
    public static int findSecondMaxSort(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        Arrays.sort(arr); // ascending order
        return arr[arr.length - 2]; // second largest
    }

    // Approach 2: Single pass (no sorting)
    public static int findSecondMaxSinglePass(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};

        int secondMaxSort = findSecondMaxSort(array.clone());
        System.out.println("Second maximum (sorted): " + secondMaxSort);

        int secondMaxSinglePass = findSecondMaxSinglePass(array);
        System.out.println("Second maximum (single pass): " + secondMaxSinglePass);
    }
}