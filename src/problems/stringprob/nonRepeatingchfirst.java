package problems.stringprob;

import java.util.HashMap;

public class nonRepeatingchfirst {

    public static void nonRepeating1(String str) {

        for(int i=0; i<str.length(); i++) {
            int count = 0;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }

    }

    public static void nonRepeating2(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();
        for(char ch : arr) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for(char ch : arr) {
            if(map.get(ch)==1) {
                System.out.println(ch);
                break;
            }
        }
    }



    public static void main(String[] args) {
        nonRepeating1("automation");
        nonRepeating2("automation");

    }
}
