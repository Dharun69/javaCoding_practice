package problems.arrayprob.geeksforgeeks.basic;

public class ArraySearch {

    // Method to search for element x in array
    public static int arraySearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 30, 4, 5};
        int x = 5;

        int index = arraySearch(arr, x);
        System.out.println("Index of " + x + " is: " + index);
    }
}