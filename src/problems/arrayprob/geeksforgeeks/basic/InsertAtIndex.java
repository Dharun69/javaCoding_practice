package problems.arrayprob.geeksforgeeks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAtIndex {

    public static void insertAtIndex(List<Integer> arr, int index, int val) {
        arr.add(index, val); // Add value at the specified index
        System.out.println(arr);
    }

    public static int[] insertAtIndex1(int[] arr, int index, int value) {
        int n = arr.length;

        int[] result = new int[n + 1];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        result[index] = value;

        for (int i = index; i < n; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int index = 2;
        int val = 90;

        int[] input = {1,2,3,4,5};

        insertAtIndex(arr, index, val);
        int[] output = insertAtIndex1(input, index, val);
        System.out.println(Arrays.toString(output));    }
}