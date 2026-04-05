package problems.arrayprob.basic;

public class MinMaxFinder {

    public static void findElements(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            // Finding min and second min
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }

            // Finding max and second max
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Second Min: " + secondMin);
        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        findElements(arr);
    }
}