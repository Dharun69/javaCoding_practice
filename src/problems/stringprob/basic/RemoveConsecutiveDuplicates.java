package problems.stringprob.basic;
public class RemoveConsecutiveDuplicates {

    // Approach 1: Using loop (recommended)
    public static String removeConsecutiveDuplicates(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    // Approach 2: Using char array (similar to split/filter)
    public static String removeConsecutiveDuplicatesUsingArray(String str) {

        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                result.append(arr[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String originalString = "aaabbbcccdddeeefgh";

        System.out.println(removeConsecutiveDuplicates(originalString));
        System.out.println(removeConsecutiveDuplicatesUsingArray(originalString));
    }
}

