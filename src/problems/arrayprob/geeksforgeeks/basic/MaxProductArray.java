package problems.arrayprob.geeksforgeeks.basic;

public class MaxProductArray {

    public static int maxProduct(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }

        return first * second;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        System.out.println("Maximum product of two elements: " + maxProduct(arr));
    }
}