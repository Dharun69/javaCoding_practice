package problems.arrayprob.geeksforgeeks.basic;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class AlternateSort {

    public static List<Integer> alternateSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr); // sort array in ascending order

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            result.add(arr[right]); // add max
            right--;
            if (left <= right) {
                result.add(arr[left]); // add min
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6};

        List<Integer> sortedAlternate = alternateSort(arr);
        System.out.println(sortedAlternate);
    }
}
