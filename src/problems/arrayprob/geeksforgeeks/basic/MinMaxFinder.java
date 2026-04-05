package problems.arrayprob.geeksforgeeks.basic;
import java.util.Arrays;

public class MinMaxFinder {

    public static int[] getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};

        int[] minMax = getMinMax(arr);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);
    }
}