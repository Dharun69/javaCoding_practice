package problems.stringprob.basic;

public class checkonlydigit {
    public static boolean checkOnlyDigit1(String s1) {

        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if(ch < '0'|| ch > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkOnlyDigit2(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isDigit(s1.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkOnlyDigit1("q1234"));
        System.out.println(checkOnlyDigit2("234"));

    }
}
