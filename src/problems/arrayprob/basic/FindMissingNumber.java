package problems.arrayprob.basic;

public class FindMissingNumber {

    // 1️⃣ Sum Comparison (two loops)
    public static void missingNumberSumLoop(int[] arr, int n) {
        int sumArr = 0;
        int sumFull = 0;

        for (int num : arr) {
            sumArr += num;
        }

        for (int i = 1; i <= n; i++) {
            sumFull += i;
        }

        System.out.println("Missing number (sum loop): " + (sumFull - sumArr));
    }

    // 2️⃣ Using Sum Formula n*(n+1)/2
    public static void missingNumberFormula(int[] arr) {
        int n = arr.length + 1; // total numbers including missing
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int expectedSum = (n * (n + 1)) / 2;
        int missingNum = expectedSum - actualSum;

        System.out.println("Missing number (formula): " + missingNum);
    }

    // 3️⃣ Check existence
    public static void missingNumberCheckExistence(int[] arr) {
        int n = arr.length + 1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
                break;
            }
        }

        System.out.println("Missing number (check existence): " + missing);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};

        missingNumberSumLoop(arr, 7);           // Approach 1
        missingNumberFormula(arr);              // Approach 2
        missingNumberCheckExistence(arr);       // Approach 3
    }
}