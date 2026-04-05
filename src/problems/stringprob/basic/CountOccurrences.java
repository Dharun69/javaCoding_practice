package problems.stringprob.basic;

public class CountOccurrences {

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        String str = "aabbccccabcddbbc";
        char charToCount = 'c';
        int occurrences = countOccurrences(str, charToCount);
        System.out.println("Number of occurrences of '"
                + charToCount + "' in '" + str + "': " + occurrences);
    }
}