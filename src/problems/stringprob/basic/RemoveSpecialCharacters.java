package problems.stringprob.basic;

public class RemoveSpecialCharacters {

    public static String removeSpecialChars(String str) {

        String specialChars = "!@#$%^&*?<>()";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (specialChars.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String removeSpecialCharsRegex(String str) {
        return str.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    public static void main(String[] args) {

        String input = "Hi! Hello$^&*^ How @re you*?";
        String result = removeSpecialChars(input);

        System.out.println("The result is: " + result);

        System.out.println(removeSpecialCharsRegex(input));
    }
}