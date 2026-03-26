package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {


    public ArrayList<ArrayList<String>> anagrams() {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        for(String word : arr) {
           char[] chars =  word.toCharArray();
           Arrays.sort(chars);

           String sorted = new String(chars);

           if(!map.containsKey(sorted)) {
               map.put(sorted, new ArrayList<>());
           }

           map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());

    }


    public static void main(String[] args) {

        GroupAnagrams GroupAnagrams = new GroupAnagrams();

        System.out.println(GroupAnagrams.anagrams());


    }


}
