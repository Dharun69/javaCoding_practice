package problems.stringprob.basic;

public class LongestWordInString {

    // Approach 1: Using split()
    public static void longestWord() {

        String str = "The quick brown fox";
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }

    // Approach 2: Without using split()
    public static void longestWord1() {

        String str = "The quick brown fox";
        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        // check last word
        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println(longest);
    }

    public static void main(String[] args) {

        longestWord();
        longestWord1();
    }
}