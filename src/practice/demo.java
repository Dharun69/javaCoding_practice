package practice;

import java.util.HashSet;
import java.util.Set;

public class demo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}



