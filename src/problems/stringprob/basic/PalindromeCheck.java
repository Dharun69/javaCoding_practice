package problems.stringprob.basic;

public class PalindromeCheck {

    // 1. Using loop (optimized with StringBuilder)
    public static void checkPalindromeUsingLoop() {

        String word = "racecar";
        StringBuilder result = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        if (word.equals(result.toString())) {
            System.out.println("It's palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }

    // 2. Using two-pointer (best)
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // ✅ 3. Using StringBuilder reverse (NEW - missing approach)
    public static boolean isPalindromeUsingReverse(String str) {

        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    // 4. Palindrome for number
    public static void checkPalindromeForNumber() {

        int num = 121;
        int originalNum = num;
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (originalNum == rev) {
            System.out.println("The given number is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {

        checkPalindromeUsingLoop();

        String str1 = "racecar";
        String str2 = "nitin";
        String str3 = "Rama";

        // Two pointer
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));

        // Reverse method
        System.out.println(isPalindromeUsingReverse(str1));
        System.out.println(isPalindromeUsingReverse(str2));
        System.out.println(isPalindromeUsingReverse(str3));

        checkPalindromeForNumber();
    }
}