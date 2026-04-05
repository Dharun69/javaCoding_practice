package problems.arrayprob.basic;

import java.util.Arrays;

public class ReverseArray {

    // Method 1: Reverse using a new array
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    // Method 2: Reverse in-place
    public static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Using new array
        int[] reversedOrder = reverseArray(myArray);
        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Reversed Order (new array): " + Arrays.toString(reversedOrder));

        // Using in-place reverse
        reverseInPlace(myArray);
        System.out.println("Original Array after in-place reverse: " + Arrays.toString(myArray));
    }
}