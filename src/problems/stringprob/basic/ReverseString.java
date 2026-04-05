package problems.stringprob.basic;

public class ReverseString {

    // 1. Using loop
    public static void reverseStr(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        System.out.println(result.toString());
    }

    // 2. Using inbuilt (StringBuilder reverse)
    public static String reverseStr1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 3. Using two pointers
    public static void reverseString() {

        String str = "dharun";
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) {

        reverseStr("GeeksforGeeks");

        System.out.println(reverseStr1("GeeksforGeeks"));

        reverseString();
    }
}
