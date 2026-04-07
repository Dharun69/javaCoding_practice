package problems.arrayprob.basic;

import java.util.Arrays;

public class RotateArray {

    // 🔹 LEFT ROTATE (Using extra array)
    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return arr;

        d = d % n;
        int[] rotated = new int[n];

        int index = 0;

        for (int i = d; i < n; i++) {
            rotated[index++] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            rotated[index++] = arr[i];
        }

        return rotated;
    }

    // 🔹 LEFT ROTATE (Brute force)
    public static int[] rotateLeftBruteForce(int[] arr, int d) {
        if (arr.length == 0) return arr;

        d = d % arr.length;

        for (int count = 0; count < d; count++) {
            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        return arr;
    }

    // 🔹 RIGHT ROTATE (Using extra array)
    public static int[] rotateRight(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return arr;

        d = d % n;
        int[] rotated = new int[n];

        int index = 0;

        // last d elements
        for (int i = n - d; i < n; i++) {
            rotated[index++] = arr[i];
        }

        // remaining elements
        for (int i = 0; i < n - d; i++) {
            rotated[index++] = arr[i];
        }

        return rotated;
    }

    // 🔹 RIGHT ROTATE (Brute force)
    public static int[] rotateRightBruteForce(int[] arr, int d) {
        if (arr.length == 0) return arr;

        d = d % arr.length;

        for (int count = 0; count < d; count++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        return arr;
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {
        int d = 2;

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5};

        System.out.println("Left Rotate: " + Arrays.toString(rotateLeft(arr1, d)));
        System.out.println("Left Brute: " + Arrays.toString(rotateLeftBruteForce(arr2, d)));

        System.out.println("Right Rotate: " + Arrays.toString(rotateRight(arr3, d)));
        System.out.println("Right Brute: " + Arrays.toString(rotateRightBruteForce(arr4, d)));
    }
}