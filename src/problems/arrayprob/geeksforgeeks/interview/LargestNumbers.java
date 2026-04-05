package problems.arrayprob.geeksforgeeks.interview;

public class LargestNumbers {

    // Function to find the largest number in an array
    public static int largestNum(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // Function to find the second largest number in an array
    public static int secondLargestNum(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};

        System.out.println("Largest number: " + largestNum(arr));         // Output: 8
        System.out.println("Second largest number: " + secondLargestNum(arr)); // Output: 7
    }
}