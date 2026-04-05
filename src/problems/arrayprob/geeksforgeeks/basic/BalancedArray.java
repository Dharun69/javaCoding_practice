package problems.arrayprob.geeksforgeeks.basic;

public class BalancedArray {

    public static int balancedArray(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.length;

        // Sum of the first half
        for (int i = 0; i < n / 2; i++) {
            sum1 += arr[i];
        }

        // Sum of the second half
        for (int i = n / 2; i < n; i++) {
            sum2 += arr[i];
        }

        return Math.abs(sum1 - sum2); // return absolute difference
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};

        int result = balancedArray(arr);
        System.out.println("Absolute difference between halves: " + result);
    }
}