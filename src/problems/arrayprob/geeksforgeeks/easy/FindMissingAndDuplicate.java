package problems.arrayprob.geeksforgeeks.easy;

public class FindMissingAndDuplicate {

    public static int[] findMissingAndDuplicate(int[] arr) {
        int n = arr.length;
        int duplicate = -1;
        int missing = -1;

        // Frequency array (size n+1 because numbers are from 1 to n)
        int[] freq = new int[n + 1];
        // Count frequency of each number
        for (int num : arr) {
            freq[num]++;
        }
        // Identify missing and duplicate numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] == 2) {
                duplicate = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 5, 4};
        int[] result = findMissingAndDuplicate(arr);
        System.out.println("Duplicate Number: " + result[0] + ", Missing Number: " + result[1]);
        // Output: Duplicate Number: 3, Missing Number: 2
    }
}