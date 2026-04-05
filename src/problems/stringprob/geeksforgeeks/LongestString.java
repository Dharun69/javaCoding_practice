package problems.stringprob.geeksforgeeks;

public class LongestString {

    public static String findLongestString(String[] arr) {

        String result = "";
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                result = arr[i];
            }
        }

        return result;
    }

    public static String findLongestString1(String[] arr) {

        String longest = "";

        for (String word : arr) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String[] arr = {"Apple", "Mango", "Orange", "Banana"};
        System.out.println(findLongestString(arr));
        System.out.println(findLongestString1(arr));

    }
}