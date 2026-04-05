package map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<String, String> places = new TreeMap<String, String> ();
		places.put("Gandhipuram", "Coimbatore");  // starts with based on key alphabet
		places.put("Ganapathy", "Coimbatore");
		places.put("Town hall", "Coimbatore");
		places.put("Bharathi", "Coimbatore");
		
		places.put("Coimabatore", "Toll gate");   //If add duplicate in the key, it will override the value.
		places.put("Coimabatore", "xyz");
		
//		places.put(null, "afd"); // if we add null, it will show nullpointerexception
		System.out.println(places);


		
		
	}

}
