package problems.stringprob;

public class ReverseWords {

    public static void reverseWord(String sentence) {

        String result = "";

        String[] arr = sentence.split(" ");

        for(int i= arr.length-1; i>=0; i--) {
            result += arr[i] + " ";
        }
        System.out.println(result);

    }




    public static void main(String[] args) {
        reverseWord("The quick brown fox");
    }
}
