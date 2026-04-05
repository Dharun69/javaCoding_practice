package problems.stringprob.basic;
import java.util.Arrays;

public class SortStringCharacters {

    public static void main(String[] args) {
        String s1 = "javascript";

        char[] chars = s1.toCharArray(); // convert string to char array
        Arrays.sort(chars);              // sort characters

        String s2 = new String(chars);   // convert back to string
        System.out.println(s2);
    }
}