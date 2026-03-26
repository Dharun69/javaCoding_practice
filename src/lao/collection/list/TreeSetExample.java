package lao.collection.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public void treeSetExample() {
		TreeSet<Integer> treeSet = new  TreeSet<Integer>();
		
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(14);
		treeSet.add(12);
		treeSet.add(13);

		System.out.println("Elements are sorted on ascending order "+ treeSet);
		
		//first()
		System.out.println("First elment "+ treeSet.first());
		
		//last()
		System.out.println("last element "+ treeSet.last());
		
		//headSet()  
		System.out.println("Values lesser than given value "+ treeSet.headSet(14));
		
		//tailset()
		System.out.println("Values equal to and higher than given value "+ treeSet.tailSet(14));
		
		//subSet() //get the values inbetween start with first.
		System.out.println("Subset values : "+ treeSet.subSet(13, 15));
		
		//comparator()
		System.out.println("Comparator returns null if the sorting is defalut natural order "+ treeSet.comparator());
	
	System.out.println("Higher "+ treeSet.higher(14));
	System.out.println("Lower "+ treeSet.lower(13));
	System.out.println("Poll First "+ treeSet.pollFirst());
	System.out.println("Poll Last "+ treeSet.pollLast());
	System.out.println("after polling "+ treeSet);
	System.out.println("Descending Order set "+ treeSet.descendingSet());
	
	//normal iteration
	Iterator<Integer> iterator = treeSet.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	
	Iterator<Integer> descIterator = treeSet.descendingIterator();
	while(descIterator.hasNext()) {
		System.out.println(descIterator.next());
	}
	
	
	}
	
	public void newtree() {
		TreeSet<String> ttreeSet = new  TreeSet<String>();
		
		ttreeSet.add("daf");
		ttreeSet.add("asf");
		ttreeSet.add("asdf");
		ttreeSet.add("sdf");
		ttreeSet.add("dsf");
		
		System.out.println(ttreeSet);
	}
	
	public static void main(String[] args) {

		TreeSetExample Ts = new TreeSetExample();
		Ts.treeSetExample();
		
		Ts.newtree();
	}

}
