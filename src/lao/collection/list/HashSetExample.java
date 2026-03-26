package lao.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	/* Number of constructors available in Hashset = 4
	 * 1. Hashset hs = new HashSet(); // size-16 and fill ratio is 0.75
	 * 2. Hashset hs = new HashSet(int initialSize); //size as declared and fill ratio is 0.75(default)
	 * 3. Hashset hs = new HashSet(int initialSize, float fillRatio); //size and fill ratio can be declared
	 * 4. HashSet hs = new HashSet(Collection c); //creates a HashSet for any given Collection
	 */ 



	public void basicExampleHashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("A"); // the return type of add() is boolean. Since A is already there it will return
		hashSet.add(null);
		hashSet.add("E");

		//we have no control on insertion order	
		System.out.println("Contents of the HashSet :"+ hashSet);
		hashSet.remove(null);
		System.out.println("Contents of the HashSet :"+ hashSet);
		System.out.println(hashSet.contains("A"));
		
		
	}

	/*
	 * Iterator using Iterator
	 */
	
	public void iterateUsingIterator() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements of HashSet :" + iterator.next());
		}
	}
	
	



	public static void main(String[] args) {

		HashSetExample hs = new 	HashSetExample();
		hs.basicExampleHashSet();
		hs.iterateUsingIterator();
	}

}
