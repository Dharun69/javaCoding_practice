package problems.stringprob.basic;

import java.util.HashMap;
import java.util.Map;

public class freqchar {

    public static void charFreq(String s1) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static void bruetForce(String s1) {
        for(int i=0; i<s1.length(); i++) {
            int count = 0;
            for(int j=0; j<s1.length(); j++) {
                if(s1.charAt(i) == s1.charAt(j)) {
                    count++;
                }
            }
            if(s1.indexOf(s1.charAt(i)) == i) {
                System.out.println(s1.charAt(i) +" =>" +count);
            }
        }
    }
    public static void main(String[] args) {
//        charFreq("automation");
        bruetForce("dharunn");
    }
}
