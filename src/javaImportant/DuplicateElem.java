package javaImportant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] Str = {"Java", "pythoc", "Java", "C", "C"};
		
		for(int i=0; i<Str.length; i++) {
			for(int j=i+1; j<Str.length; j++) {
				if(Str[i].equals(Str[j])) {
					System.out.println(Str[i]);
				}
			}
		}
		
		System.out.println("____________");
		
		Set<String> store =  new HashSet<String>();
		
		for(String name : Str) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}
		
		
		System.out.println("*******using hashmap*****");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String name : Str) {
			Integer count = map.get(name);
			
			if(count == null) {
				map.put(name, 1);
			} else {
				map.put(name, count++);
			}
		}
		
		
		Set<Entry<String, Integer>> entrySet =	map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is :"+ entry.getKey());	
			}
			
		}
	}

}
