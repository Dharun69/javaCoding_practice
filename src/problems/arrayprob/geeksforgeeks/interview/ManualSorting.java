package problems.arrayprob.geeksforgeeks.interview;

public class ManualSorting {

    // ===========================
    // Selection Sort
    // ===========================

    // Descending Order - Selection Sort
    public static int[] sortDescendingSelection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Ascending Order - Selection Sort
    public static int[] sortAscendingSelection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // ===========================
    // Bubble Sort
    // ===========================

    // Descending Order - Bubble Sort
    public static int[] sortDescendingBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Ascending Order - Bubble Sort
    public static int[] sortAscendingBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // ===========================
    // Main Method for Testing
    // ===========================

    public static void main(String[] args) {

        int[] arr = {3, 2, 14, 56, 7};
        int[] arr1 = {213, 9238, 756, 7862, 832, 735628};

        System.out.print("Selection Sort Descending: ");
        for (int num : sortDescendingSelection(arr.clone())) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Selection Sort Ascending: ");
        for (int num : sortAscendingSelection(arr1.clone())) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Bubble Sort Descending: ");
        for (int num : sortDescendingBubble(arr.clone())) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Bubble Sort Ascending: ");
        for (int num : sortAscendingBubble(arr1.clone())) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}