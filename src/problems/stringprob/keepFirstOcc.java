package problems.stringprob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class keepFirstOcc {


    public static void keepFirstOcc(String str) {

        Set<Character> set = new HashSet<>();
        String result = "";

        for(char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }
        System.out.println(result);

    }


    public static void keepFirstOcc1(String str) {

        HashMap<Character, Boolean> map = new HashMap<>();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, true);
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void keepFirstOcc2(String str) {

        String result = "";

        for(char ch : str.toCharArray()) {
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        System.out.println(result);
    }


    public static void main(String[] args) {
        keepFirstOcc("programming");
        keepFirstOcc1("programming");
        keepFirstOcc2("programming");

    }
}
