package problems.stringprob.basic;

public class CountWords {
    // Approach 1: Using split
    public static int countWordsUsingSplit(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    // Approach 2: Without using split
    public static int countWordsWithoutSplit(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        String str = "The quick brown fox";
        // Approach 1
        int result1 = countWordsUsingSplit(str);
        System.out.println("Using split(): " + result1);

        // Approach 2
        int result2 = countWordsWithoutSplit(str);
        System.out.println("Without split(): " + result2);
    }
}