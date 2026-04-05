package problems.stringprob.basic;

public class ReverseWords {

    public static void reverseWordsInSentence(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println(result.trim()); // remove extra space at end
    }

    public static void reverseWordsInSentence1(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        reverseWordsInSentence("The quick brown fox");
        reverseWordsInSentence1("The quick brown fox");

    }
}

