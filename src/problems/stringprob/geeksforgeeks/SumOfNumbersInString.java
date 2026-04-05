package problems.stringprob.geeksforgeeks;

public class SumOfNumbersInString {

    public static int sumOfNumbersInString(String s) {

        int sum = 0;
        String tempNum = "";

        for (int i = 0; i <= s.length(); i++) {

            char ch = i < s.length() ? s.charAt(i) : ' '; // Add dummy char at end

            if (Character.isDigit(ch)) {
                tempNum += ch;
            } else {
                if (!tempNum.isEmpty()) {
                    sum += Integer.parseInt(tempNum);
                    tempNum = "";
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "1abc23";
        System.out.println(sumOfNumbersInString(str)); // Output: 24
    }
}