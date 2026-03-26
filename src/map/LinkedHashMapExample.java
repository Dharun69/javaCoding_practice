package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> employeeMap = new LinkedHashMap<Integer, String>();
		//To insert an element PUT method is used. 
		
		employeeMap.put(1, "dharun");  //ENTRY, Is key and value both stored in the map
		employeeMap.put(2, "cark");
		employeeMap.put(3, "dad");
		employeeMap.put(4, "afd");
		employeeMap.put(5, "afd");
		employeeMap.put(6, "faadf");
		System.out.println("LinkedHashMap " + employeeMap);

		LinkedHashMap<String, String>  heros = new LinkedHashMap<String, String>();
		heros.put("Iron man", "Tony Stark"); // Insertion order will maintain.
		heros.put("Bat man", "Bruce");        //if we insert duplicate null two or more, then the value will override
		heros.put("Super man", "Clark");
		heros.put(null, "Powerstar");
		heros.put(null, "str");


		System.out.println("LinkedHashMap " +heros);
		
		HashMap<String, String> hashMapHeros = new HashMap<String, String>();
		hashMapHeros.put("Iron man", "Tony Stark");  //random order
		hashMapHeros.put("Bat man", "Bruce");
		hashMapHeros.put("Super man", "Clark");
		hashMapHeros.put(null, "XYZ"); //if we insert duplicate null two or more, then the value will override
		hashMapHeros.put(null, "ABC");

		System.out.println("HashMap "+hashMapHeros);

	}

}
