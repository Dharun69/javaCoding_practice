package problems.stringprob.geeksforgeeks.easy;

public class ReverseVowels {


    public static String reverseVowels(String str) {

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while (left < right) {

            if(!isVowels(arr[left])) {
                left++;
            } else if(!isVowels(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static boolean isVowels(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }




    public static void main(String[] args) {
        System.out.println(reverseVowels("geeksforgeeks"));
        System.out.println(reverseVowels("practice"));

    }
}
