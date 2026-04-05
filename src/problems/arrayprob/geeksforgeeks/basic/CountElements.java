package problems.arrayprob.geeksforgeeks.basic;

public class CountElements {

    public static int countOfElements(int x, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int x = 9;
        int[] arr = {10, 1, 2, 8, 4, 5};

        int count = countOfElements(x, arr);
        System.out.println("Number of elements <= " + x + " is: " + count);
    }
}