package problems.stringprob;

public class Palindrome {

    public static void palindromeStr(String str) {

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void palindromeStr1(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a Palindrome");
                return;
            }

            left++;
            right--;
        }

        System.out.println("It's a Palindrome");
    }

    public static void main(String[] args) {

        palindromeStr("madam");
        palindromeStr("hello");
        palindromeStr1("hello");


    }
}