package problems.stringprob.basic;
import java.util.Arrays;
import java.util.HashMap;

public class anagram {

    public static boolean anagram(String s1, String s2) {
        // Input: s1 = “geeks”  s2 = “kseeg”
        // Output: true
        // Explanation: Both the string have same characters with same frequency. So, they are anagrams.
        if(s1.length() != s2.length()) {
            return false;
        }
        char[] str1 = s1.toCharArray();
        Arrays.sort(str1);
        char[] str2 = s2.toCharArray();
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


    public static void anagram1(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }
        System.out.println(map);
        for(char ch : s2.toCharArray()) {
            if(!map.containsKey(ch)) {
                System.out.println("not anagram");
            }
           map.put(ch, map.get(ch)-1);
        }
        for(int value : map.values()) {
            if(value != 0) {
                System.out.println("not anagram");
            }
        }
        System.out.println("Anagram");
    }




    public static void main(String[] args) {
        System.out.println(anagram("geeks", "kseeg"));
        anagram1("slient", "listen");
    }

}
