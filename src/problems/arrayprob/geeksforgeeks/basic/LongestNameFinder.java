package problems.arrayprob.geeksforgeeks.basic;

public class LongestNameFinder {

    public static String longestName(String[] arr) {
        String result = "";
        int maxLength = 0;

        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                result = str;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"Apple", "Mango", "Orange", "Banana"};
        System.out.println("Longest name: " + longestName(arr1));
    }
}