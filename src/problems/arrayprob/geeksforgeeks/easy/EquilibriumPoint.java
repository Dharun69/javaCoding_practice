package problems.arrayprob.geeksforgeeks.easy;

public class EquilibriumPoint {

    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;

        // Calculate total sum of array
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Iterate to find equilibrium point
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i; // Equilibrium index found
            }
            leftSum += arr[i];
        }

        return -1; // No equilibrium point
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr)); // Output: 2
    }
}
