package problems.arrayprob.basic;

import java.util.*;

public class UniqueTriplets {

    // Approach 1: Brute-force (triple loop)
    public static List<List<Integer>> findTripletsBruteForce(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // optional for ordered triplets

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!result.contains(triplet)) { // ensure unique
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }

    // Approach 2: Optimized Two-Pointer
    public static List<List<Integer>> findTripletsTwoPointer(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // required

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        List<List<Integer>> tripletsBruteForce = findTripletsBruteForce(nums, target);
        System.out.println("Brute-force approach: " + tripletsBruteForce);

        List<List<Integer>> tripletsTwoPointer = findTripletsTwoPointer(nums, target);
        System.out.println("Two-pointer approach: " + tripletsTwoPointer);
    }
}
