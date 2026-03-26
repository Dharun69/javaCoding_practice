package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	
	public static void main(String[] args) {
		HashMap<String, String> hashMapHeros = new HashMap<String, String>();
		hashMapHeros.put("Iron man", "Tony Stark");  //random order
		hashMapHeros.put("Bat man", "Bruce");
		hashMapHeros.put("Super man", "Clark");
		System.out.println(hashMapHeros);
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		//To insert an element PUT method is used. 
		
		employeeMap.put(1, "dharun");  //ENTRY, Is key and value both stored in the map
		employeeMap.put(2, "cark");
		employeeMap.put(3, "dad");
		employeeMap.put(4, "afd");
		employeeMap.put(5, "afd");
		employeeMap.put(6, "faadf");

		System.out.println("Employee Map "+ employeeMap);
		
		//To make a copy of the existion map.
		Map<Integer, String> duplicateMap =  new HashMap<Integer, String>();
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate Map "+ duplicateMap);
		
		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("After Clearing "+ duplicateMap);
		
		//To check if a key is present or not in the Map
		System.out.println("Does this map has key 1 "+employeeMap.containsKey(1));
		
		//To check if a Value is present or not in the Map
		System.out.println("Does this map has value faadf?  "+employeeMap.containsValue("faadf"));
		
		//clone the map
		System.out.println("Cloned Map"+ employeeMap);
		
		//check if the map is empty or not
		System.out.println("Is empty ?"+ employeeMap.isEmpty());
		
		//Fetch the set of keys in the Map (Note: Here it's not list of keys, it's set of keys.
		//Because List will allow duplicate but Set Won't. Keys should be unique.
		System.out.println("Key set "+ employeeMap.keySet());
		

		//Fetch a value
		System.out.println(employeeMap.get(1));
		
		//Fetch all the values
		System.out.println("All values "+employeeMap.values());
		
		//Entry set 
		System.out.println("Entry set "+ employeeMap.entrySet());
		
	}

}
