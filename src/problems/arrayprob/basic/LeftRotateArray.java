package problems.arrayprob.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotateArray {

    // Method to rotate array to the left by d positions
    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return arr;

        d = d % n; // handle cases where d > n
        int[] rotated = new int[n];

        int index=0;
        for(int i=d;i< arr.length;i++){
            rotated[index++]=arr[i];
        }

        for(int i=0;i<d;i++){
            rotated[index++]=arr[i];
        }

        return rotated;
    }

    public static int[] rotateLeftBruteForce(int[] arr, int d) {
        if (arr.length == 0) return arr;
        d = d % arr.length;
        int count = 0;
        while(count < d) {
            int firstElement = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = firstElement;
            count++;

        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        System.out.println(Arrays.toString(rotateLeft(arr,d)));
        System.out.println(Arrays.toString(rotateLeftBruteForce(arr,d)));


    }

}


