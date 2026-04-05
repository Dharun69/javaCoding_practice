package problems.stringprob.basic;

public class ReverseNumber {

    public static void reverseNum(int num) {

        int result = 0;

        while (num != 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        reverseNum(1234);
    }
}