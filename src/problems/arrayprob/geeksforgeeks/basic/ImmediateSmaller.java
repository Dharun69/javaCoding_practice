package problems.arrayprob.geeksforgeeks.basic;
import java.util.Arrays;

public class ImmediateSmaller {

    public static int[] immediateSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result[i] = arr[i + 1];
            } else {
                result[i] = -1;
            }
        }

        result[n - 1] = -1; // Last element always -1
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};

        int[] result = immediateSmaller(arr);
        System.out.println(Arrays.toString(result));
    }
}