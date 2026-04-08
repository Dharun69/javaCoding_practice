package problems.stringprob.geeksforgeeks;
public class RemoveCharacters {

    public static String removeChars(String s1, String s2) {

        String result = "";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (!s2.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        return result;
    }

    public static String removeChars1(String s1, String s2) {

        String result = "";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (s2.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeChars("computer", "cat")); // ompuer
        System.out.println(removeChars1("computer", "cat")); // ompuer

    }
}