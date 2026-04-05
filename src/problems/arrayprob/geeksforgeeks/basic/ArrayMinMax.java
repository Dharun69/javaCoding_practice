package problems.arrayprob.geeksforgeeks.basic;

public class ArrayMinMax {

    // Find the largest element
    public static int largestEle(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Find the second largest element
    public static int secondLargestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max; // previous max becomes secondMax
                max = num;       // update max
            } else if (num > secondMax && num != max) {
                secondMax = num; // update secondMax if greater than current secondMax
            }
        }

        return secondMax;
    }

    // Find the minimum element
    public static int minNum(int[] arr) {
        int minValue = arr[0];
        for (int num : arr) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 7, 56, 90};
        System.out.println("Largest element: " + largestEle(arr1));

        int[] arr2 = {4, 6, 8, 3, 9, 5};
        System.out.println("Second largest element: " + secondLargestNumber(arr2));

        int[] arr3 = {12, 5, 7, 8};
        System.out.println("Minimum element: " + minNum(arr3));
    }
}
