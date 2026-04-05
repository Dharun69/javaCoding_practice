package problems.arrayprob.geeksforgeeks.basic;

public class MultiplyHalves {

    public static int multiply(int[] arr) {
        int sum1 = 0, sum2 = 0;
        int n = arr.length;
        int mid = (int) Math.ceil(n / 2.0); // middle index for splitting

        for (int i = 0; i < mid; i++) {
            sum1 += arr[i];
        }
        for (int i = mid; i < n; i++) {
            sum2 += arr[i];
        }

        return sum1 * sum2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Product of sums of two halves: " + multiply(arr));
    }
}