package problems.arrayprob.basic;

import java.util.Arrays;

public class RotateArray {

    // Method to rotate array to the right by k positions
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) {
            return arr; // empty array
        }

        k = k % n; // handle rotation greater than length
        int[] rotated = new int[n];

        // Copy last k elements to the front
        for (int i = 0; i < k; i++) {
            rotated[i] = arr[n - k + i];
        }

        // Copy first n-k elements after the rotated part
        for (int i = k; i < n; i++) {
            rotated[i] = arr[i - k];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int rotationFactor = 2;

        int[] rotatedArray = rotateArray(inputArray, rotationFactor);

        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }
}