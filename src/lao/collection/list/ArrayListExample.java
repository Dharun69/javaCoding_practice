package lao.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public void arrayListExample() {

		List<String> arrayList =  new ArrayList<String>();
		arrayList.add("benz");
		arrayList.add("duke");
		arrayList.add("bmw");
		arrayList.add("bmw");

		
		System.out.println(arrayList);

		System.out.println(arrayList.get(0));

		System.out.println(arrayList.lastIndexOf("bmw"));

		System.out.println(arrayList.lastIndexOf("bmw"));

		System.out.println(arrayList.lastIndexOf("ducati"));

		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		anotherList.clear();
		System.out.println(anotherList);

		arrayList.remove(0);
		System.out.println(arrayList);

		arrayList.remove("duke");
		System.out.println(arrayList);

		arrayList.add(null);
		System.out.println(arrayList);

		arrayList.set(0, "duke");
		System.out.println(arrayList);

		System.out.println(arrayList.isEmpty());

		//Iterate
		for (String string : arrayList) {
			System.out.println("using for each : " +string);
		}
		System.out.println("-------------------");

		for(int i=0; i<arrayList.size();i++) {
			System.out.println("Using for loop"+" "+arrayList.get(i));
		}

		System.out.println("-------------------");
		
		ListIterator<String> listIterator = arrayList.listIterator();
		while(listIterator.hasNext()) {

			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
			System.out.println("-------------------");

			Iterator<String> Iterator = arrayList.iterator();
			while(Iterator.hasNext()){
				System.out.println("Forward Only " +Iterator.next());
			}
			
			
			
		
		
	}

	
	public static void main(String[] args) {

		ArrayListExample ex = new ArrayListExample();
		ex.arrayListExample();

	}

}
