package problems.arrayprob.geeksforgeeks.basic;
import java.util.Arrays;

public class LeftRotateArray {

    // Approach 1: Iterative shifting
    public static int[] leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int count = 0; count < k; count++) {
            int firstElement = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = firstElement;
        }

        return arr;
    }

    // Approach 2: Using array slicing
    public static int[] leftRotateUsingSlice(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] rotated = new int[n];
        // Copy from k to n
        for (int i = 0; i < n - k; i++) {
            rotated[i] = arr[i + k];
        }
        // Copy first k elements to the end
        for (int i = 0; i < k; i++) {
            rotated[n - k + i] = arr[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        System.out.println("Left Rotate (Iterative): " + Arrays.toString(leftRotate(Arrays.copyOf(arr, arr.length), k)));
        System.out.println("Left Rotate (Slice method): " + Arrays.toString(leftRotateUsingSlice(arr, k)));
    }
}