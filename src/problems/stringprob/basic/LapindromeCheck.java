package problems.stringprob.basic;

import java.util.Arrays;

public class LapindromeCheck {
    public static boolean isLapindrome(String str) {
        int length = str.length();
        int mid = length / 2;
        String leftHalf;
        String rightHalf;

        // Handle odd length (ignore middle char)
        if (length % 2 == 0) {
            leftHalf = str.substring(0, mid);
            rightHalf = str.substring(mid);
        } else {
            leftHalf = str.substring(0, mid);
            rightHalf = str.substring(mid + 1);
        }

        // Convert to char arrays and sort
        char[] leftArr = leftHalf.toCharArray();
        char[] rightArr = rightHalf.toCharArray();

        Arrays.sort(leftArr);
        Arrays.sort(rightArr);

        return Arrays.equals(leftArr, rightArr);
    }

    public static void logResult(String str) {
        if (isLapindrome(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {

        logResult("gaga");     // YES
        logResult("abcde");    // NO
        logResult("rotor");    // YES
        logResult("xyzxy");    // YES
        logResult("abbaab");   // NO
        logResult("ababc");    // NO
    }
}