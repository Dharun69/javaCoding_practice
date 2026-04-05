package problems.arrayprob.basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        // Rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse array from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(0, maxFromRight); // insert at beginning to maintain order
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        int[] arrayInput = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arrayInput);

        System.out.println("Leaders in the array: " + leaders);
        // Output: Leaders in the array: [17, 5, 2]
    }
}