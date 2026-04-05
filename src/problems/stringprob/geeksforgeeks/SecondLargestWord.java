package problems.stringprob.geeksforgeeks;

public class SecondLargestWord {

    public static String findSecondLargestWord(String sentence) {

        String[] words = sentence.split(" ");
        String largest = "";
        String secondLargest = "";

        for (String word : words) {
            if (word.length() > largest.length()) {
                secondLargest = largest;
                largest = word;
            } else if (word.length() > secondLargest.length() && !word.equals(largest)) {
                secondLargest = word;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(findSecondLargestWord(str)); // Output: jumps
    }
}