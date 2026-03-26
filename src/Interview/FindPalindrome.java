package Interview;

public class FindPalindrome {

    public static void check(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not Palindrome");
                return;
            }

            left++;
            right--;
        }

        System.out.println("Palindrome");
    }

    public static void main(String[] args) {

        check("madam");
    }
}