package problems.arrayprob.basic;

public class ArrayLength {

    public static int arrayLength(int[] arr) {
        int count = 0;

        // Use for-each loop to count elements manually
        for (int element : arr) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};

        int length = arrayLength(arr1);
        System.out.println("Length of the array is: " + length); // Output: 5
    }
}