package lao.collection.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	/*
	 * LinkedHashSet --> Child class of HashSet
	 * Ds --> Hash table + Linked List
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */
	
	
	
	public void linkedHashSetExample() {
		Set linkedHashSet = new LinkedHashSet(); //without henerous
	
		 linkedHashSet.add(1);
		 linkedHashSet.add("A");
		 linkedHashSet.add("B");
		 linkedHashSet.add("D");
		 linkedHashSet.add(10);
		 linkedHashSet.remove(10);
		 linkedHashSet.add(null);
		 System.out.println("Insertion order preseved linked hash set :"+linkedHashSet);
	System.out.println("Size "+ linkedHashSet.size());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample linkedhash = new LinkedHashSetExample();
		linkedhash.linkedHashSetExample();
	}

}
