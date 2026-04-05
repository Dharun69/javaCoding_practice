package problems.stringprob.basic;

public class StringOperations {

    // 1. Remove first occurrence of character "G"
    public static void removeFirstOcc(String s) {
        String res = s.replaceFirst("G", "");
        System.out.println(res);
    }

    // 2. Delete first character
    public static void deleteFirstOcc(String s) {
        String res = s.substring(1);
        System.out.println(res);
    }

    // 3. Split string (like JS split)
    public static void splitExample() {
        String s1 = "Hello, JavaScript world!";
        String[] parts = s1.split("JavaScript");

        for (String part : parts) {
            System.out.println(part);
        }
    }

    // 4. First letter uppercase
    public static void capitalizeFirstLetter() {
        String str = "javaScript";
        String res = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(res);
    }

    // 5. Get last character & trim
    public static void lastCharAndTrim() {
        String word = "   JavaScript";

        char lastChar = word.charAt(word.length() - 1);
        System.out.println("Last char: " + lastChar);

        String trimmed = word.trim();
        System.out.println("Trimmed: " + trimmed);
    }

    // 6. Reverse a string
    public static void reverseString(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println("Reversed: " + result);
    }

    // 7. Check palindrome
    public static void checkPalindrome(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is NOT Palindrome");
        }
    }

    // 8. Count vowels
    public static void countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels count: " + count);
    }

    // 9. Replace spaces with '*'
    public static void replaceSpaceWithStar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result += '*';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    // 10. Sort characters in string
    public static void sortString(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) {

        String s = "GeeksForGeeks";

        removeFirstOcc(s);
        deleteFirstOcc(s);

        splitExample();

        capitalizeFirstLetter();

        lastCharAndTrim();

        reverseString("hello");

        checkPalindrome("madam");

        countVowels("automation");

        replaceSpaceWithStar("hi how are you");

        sortString("javascript");
    }
}