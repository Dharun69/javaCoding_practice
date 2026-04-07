package problems.arrayprob.basic;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static Map<Integer, Integer> calculateFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
//            if (frequency.containsKey(num)) {
//                frequency.put(num, frequency.get(num) + 1);
//            } else {
//                frequency.put(num, 1);
//            }
            frequency.put(num, frequency.getOrDefault(num, 0)+1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1};
        Map<Integer, Integer> frequencies = calculateFrequency(arr);

        System.out.println("Frequency of elements in the array: " + frequencies);
        // Output: {1=4, 2=3, 3=2, 4=1, 5=1}
    }
}
