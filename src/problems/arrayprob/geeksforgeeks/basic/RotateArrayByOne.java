package problems.arrayprob.geeksforgeeks.basic;

public class RotateArrayByOne {

    public static int[] rotateOne(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr; // Handle empty array

        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }

        arr[0] = last;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = rotateOne(arr);

        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
