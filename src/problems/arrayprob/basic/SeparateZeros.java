package problems.arrayprob.basic;

import java.util.ArrayList;
import java.util.List;

public class SeparateZeros {

    public static List<String> separateZeros(List<String> arr) {
        List<String> zeros = new ArrayList<>();
        List<String> others = new ArrayList<>();

        for (String item : arr) {
            if (item.equals("0")) {
                zeros.add(item);
            } else {
                others.add(item);
            }
        }

        // Combine zeros and others
        zeros.addAll(others);
        return zeros;
    }

    public static void main(String[] args) {
        List<String> inputArray = List.of("0", "1", "3", "0", "5", "0", "8");
        List<String> result = separateZeros(inputArray);
        System.out.println(result); // [0, 0, 0, 1, 3, 5, 8]
    }
}