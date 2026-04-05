package problems.stringprob.geeksforgeeks;

public class IncrementString {

    // 1️⃣ Increment letters only with wrap-around
    public static String incrementAlphabetChars(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) ((ch - 'a' + 1) % 26 + 'a'));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char) ((ch - 'A' + 1) % 26 + 'A'));
            } else {
                result.append(ch); // Non-alphabetic remains unchanged
            }
        }

        return result.toString();
    }

    // 2️⃣ Simple increment (all chars incremented by 1)
    public static String incrementAllChars(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            result.append((char) (ch + 1));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "ABC";

        System.out.println(incrementAlphabetChars(str1)); // Ifmmp, Xpsme!
        System.out.println(incrementAllChars(str2));      // BCD
    }
}