package problems.stringprob.geeksforgeeks.easy;

public class RemoveVowels {

    public static String removeVowelsFromStr(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!isVowels(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean isVowels(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        System.out.println(removeVowelsFromStr("welcome to geeksforgeeks"));
    }
}
