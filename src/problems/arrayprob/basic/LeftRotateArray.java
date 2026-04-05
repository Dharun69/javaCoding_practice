package problems.arrayprob.basic;

import java.util.Arrays;

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


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        System.out.println(Arrays.toString(rotateLeft(arr,d)));

    }

}


