package dsa;

import java.util.Iterator;

public class DemoLinked {

	public static void main(String[] args) {


		DemoLinkedList<Integer> list = new DemoLinkedList<Integer>();

		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.insertAtBeginning(4);
		list.insertAtBeginning(6);

		list.display();

	
		
		System.out.println();

		list.deleteAtPos(0);
		list.display();

		System.out.println();

		for (Integer a : list) {
			System.out.print(a + " ");
		}

		System.out.println();

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ "  ");
		}

		System.out.println();

		list.reverse();
		list.display();

		
		System.out.println();
		System.out.println("---------Doubly----------");

		DemoDoublyLinked<Integer> li = new DemoDoublyLinked<Integer>();

		li.insertAtBeginning(3);
		li.insertAtBeginning(9);
		li.insertAtBeginning(7);
		li.display();
		System.out.println("");
		li.displayRev();	
		
		li.insertAtPos(3, 4);
		System.out.println("");

		li.display();
		
		System.out.println();
		
		li.deleteAtPos(1);
		li.display();
	}

}
