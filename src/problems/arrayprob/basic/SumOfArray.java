package problems.arrayprob.basic;

public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // Iterate over each element
        for (int element : array) {
            sum += element;
        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
}