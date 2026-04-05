package problems.stringprob.geeksforgeeks;

public class FirstRepeatingChar {

    public static char firstRepeatingBrute(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return s.charAt(i);
                }
            }
        }

        return '\0'; // No repeating character
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        char result = firstRepeatingBrute(str);
        if (result != '\0') {
            System.out.println(result); // Output: g
        } else {
            System.out.println("No repeating character");
        }
    }
}
