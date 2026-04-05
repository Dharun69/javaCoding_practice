package problems.arrayprob.geeksforgeeks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAtIndex {

    public static void insertAtIndex(List<Integer> arr, int index, int val) {
        arr.add(index, val); // Add value at the specified index
        System.out.println(arr);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int index = 2;
        int val = 90;

        insertAtIndex(arr, index, val);
    }
}