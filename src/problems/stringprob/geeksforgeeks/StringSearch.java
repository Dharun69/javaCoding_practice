package problems.stringprob.geeksforgeeks;

public class StringSearch {

    public static int findFirstOccurrence(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findFirstOccurrence("GeeksForGeeks", "Fr"));   // -1
        System.out.println(findFirstOccurrence("GeeksForGeeks", "For"));  // 5
    }
}