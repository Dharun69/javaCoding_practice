package problems.arrayprob.geeksforgeeks.basic;

public class Chocolates {

    public static int chocolates(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            if (arr[first] > arr[last]) {
                first++;
            } else {
                last--;
            }
        }

        return arr[first];
        // Alternative: return the minimum value
        // int min = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] < min) min = arr[i];
        // }
        // return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 6};

        int result = chocolates(arr);
        System.out.println("Result: " + result);
    }
}
