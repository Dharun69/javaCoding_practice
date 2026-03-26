package Interview;

import java.util.HashMap;

public class FirstNonRepeatedChar {


    public  static void firstNonRepeatedCh2(String str) {

        HashMap<Character, Integer> map = new HashMap<>();


        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);

        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }

    public static void main(String[] args) {
        firstNonRepeatedCh2("automation");
    }
}


