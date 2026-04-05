package problems.stringprob.geeksforgeeks;

public class RemoveSpaces {

    // Approach 1: Using split
    public static String removeSpaces(String s) {

        String[] parts = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            if (part.length() != 0) {
                result.append(part);
            }
        }

        return result.toString();
    }

    // Approach 2: Using simple loop
    public static String removeSpacesSimple(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "geeks for geeks";

        System.out.println(removeSpaces(str));        // geeksforgeeks
        System.out.println(removeSpacesSimple(str));  // geeksforgeeks
    }
}