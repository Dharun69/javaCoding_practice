package problems.arrayprob.geeksforgeeks.interview;

import java.util.Arrays;

public class SortExample {

    // Approach 1: Using built-in sort (ascending)
    public static int[] ascendingSort(int[] arr) {
        int[] result = arr.clone(); // clone to avoid modifying original
        Arrays.sort(result);
        return result;
    }

    // Approach 2: Using built-in sort (descending)
    public static int[] descendingSort(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (a, b) -> b - a);
        return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
    }

    // Approach 3: Bubble sort ascending
    public static int[] bubbleSort(int[] arr) {
        int[] result = arr.clone();
        int n = result.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    // Approach 4: Bubble sort descending
    public static int[] bubbleSortDescending(int[] arr) {
        int[] result = arr.clone();
        int n = result.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (result[j] < result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Ascending (built-in): " + Arrays.toString(ascendingSort(arr)));
        System.out.println("Descending (built-in): " + Arrays.toString(descendingSort(arr)));
        System.out.println("Bubble Sort Ascending: " + Arrays.toString(bubbleSort(arr)));
        System.out.println("Bubble Sort Descending: " + Arrays.toString(bubbleSortDescending(arr)));
    }
}