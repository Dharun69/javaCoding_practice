package problems.arrayprob.geeksforgeeks.basic;

public class MaxAdjacent {

    public static int[] maxAdj(int[] arr) {
        int n = arr.length;
        if (n < 2) return new int[0]; // No adjacent pairs

        int[] result = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            result[i] = Math.max(arr[i], arr[i + 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int[] result = maxAdj(arr);

        System.out.print("Max of adjacent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
