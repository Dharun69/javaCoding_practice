package lao.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	/**
	 * LinkeList is implemented using Doubly linked list. This is best suited for insertion and delection
	 * Unlike ArrayList, this is not the best for retrieving the data.
	 *All the collections implements Serializable and clonable interfaces.
	 *LinkedList also implements those intferface but not RandomAccess Interface.
	 */
	public void linkedListOperationsExample() {
		//create a simple Linked list
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(5);
		System.out.println("Linked List :"+linkedList);

		//add an element to the first position
		linkedList.addFirst(1);
		System.out.println("Linked List after adding first:"+linkedList);

		//add an element at last
		linkedList.addLast(6);
		System.out.println("Linked List after adding last :"+linkedList);

		/* LinkedList performs the worst if the operation is retrieval of data.
		 * Hence if our requirement is to fetch data, we should use ArrayList.
		 * But LinkedList is the best choice if we have requirements of adding and 
		 * removing data very often. In this case we should avoid ArrayList.
		 */

		//get the first value
		System.out.println("First value :" + linkedList.getFirst());

		//get the first value using index position
		System.out.println("First value using index :"+linkedList.get(0));

		/* Now get the third value of the list.
		 * Since LinkedList has the data structure of doubly linked list,
		 * the value of the third index is known only to the link present in the second index.
		 * Internally, the program will traverse to index number 2 and then only it can get the 
		 * value of 3. So linked list is not suited for search operations.
		 */

		System.out.println("First value using index :"+linkedList.get(3));

		//update the values using set().
		//integer newFirst= linkedList.get(0);
		//linkedList.set(0, newFirst);
		//System.err.printIn("after 0th position updated :"+linkedList);

		//removeFirst and removeLast
		System.out.println("Remove first :"+ linkedList.removeFirst());
		System.out.println(linkedList);
		System.out.println("Remove first :"+ linkedList.removeLast());
		System.out.println(linkedList);

		//poll mehtod and pollfirst() deletes the first element in the list
		System.out.println(linkedList.poll());  //delete first
		System.out.println(linkedList);

		//pollLast deletes the last
		linkedList.pollLast();
		System.out.println(linkedList);

		//remove deletes the first element
		linkedList.remove();
		System.out.println(linkedList);

		//adding
		linkedList.addFirst(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(6);
		linkedList.add(7);
		System.out.println(linkedList);

		//removeFirstOccurence
		linkedList.removeFirstOccurrence(4);
		linkedList.removeFirstOccurrence(5);
		System.out.println("after removing the first occurence of 4 and 5 "+ linkedList);
		//removeLastOccurrence
		linkedList.removeLastOccurrence(6);
		System.out.println("after removing the last occurence of 6 "+linkedList);

		System.out.println("---------------------------------");

	}

	/*
	 * Iteration of linked list with simple for loop
	 */

	public void iterateLinkedListWithSimplefor () {
		LinkedList<String> S = new LinkedList<String>();
		S.add("a");
		S.add("b");
		S.add("c");
		S.add("d");
		System.out.println("simple for loop");
		for (int i=0;i<S.size(); i++) {
			System.out.println("Elements in the LL are "+ S.get(i));
		}

		System.out.println("------------------------");

	}

	/*
	 * Iteration of linked list with advance for loop (for each)
	 */
	public void iterationWithAdvancedfor() {
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("ab");
		linkList.add("bc");
		linkList.add("cd");
		linkList.add("de");
		System.out.println("for each");

		for (String string : linkList) {
			System.out.println("Elements in the LL are "+ string);

		}
		System.out.println("----------------------");
	}

	/*
	 * Iterate using while
	 */

	public void iterateUsingWhile() {
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("ab");
		linkList.add("bc");
		linkList.add("cd");
		linkList.add("de");
		int number=0;
		System.out.println("While");

		while(linkList.size()>number) {
			System.out.println("Elments in the LL are "+ linkList.get(number));
			number++;
		}
		System.out.println("---------------------");
	}

	/*
	 * Iterate using Iterator
	 */


	public void iterateUsingIterator() { 
		LinkedList<String> linkList = new LinkedList<String>(); 
		linkList.add("ab"); 
		linkList.add("bc");
		linkList.add("cd"); 
		linkList.add("de"); 

		Iterator<String> iterator = linkList.iterator(); 
		System.out.println("Iterator");
		while(iterator.hasNext()) { 
			System.out.println("Elemts in the LL are "+ iterator.next()); 

		}

	}


	public static void main(String[] args) {

		LinkedListExample li = new LinkedListExample();
		li.linkedListOperationsExample();

		li.iterateLinkedListWithSimplefor();
		li.iterationWithAdvancedfor();
		li.iterateUsingWhile();
		li.iterateUsingIterator();
	}

}
