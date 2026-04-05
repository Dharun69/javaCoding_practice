package problems.arrayprob.geeksforgeeks.easy;

import java.util.Arrays;

public class MoveZeros {

    // Approach 1: Swap non-zero elements with pointer
    public static int[] moveZeros(int[] arr) {
        int j = 0; // pointer for next non-zero position

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap only if i != j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

    // Approach 2: Copy non-zeros and fill remaining with zeros
    public static int[] moveZeros1(int[] arr) {
        int index = 0;

        // Step 1: copy all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Approach 1: " + Arrays.toString(moveZeros(arr)));

        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Approach 2: " + Arrays.toString(moveZeros1(arr1)));
    }
}