package dsa;

import java.util.Iterator;

public class DemoLinkedList<T> implements Iterable<T>{

	Node head;
	class Node{

		T data;
		Node next;        //next will refer the node object. It's a reference variable
		Node(T val){
			data=val;
			next=null;
		}
	}

	DemoLinkedList(){
		head = null;	
	}

	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		//when list empty

		if(head==null)
			head=newNode;
		else {  //list is not empty
			newNode.next = head;
			head = newNode;
		}
	}


	public void display() {

		Node temp = head; //start from head
		while(temp!=null) { //null implies end of 
			System.out.print(temp.data+" ");
			temp =temp.next; //jump

		}

	}

	public void insertAtPos(int pos, T val) {

		if(pos==0) {
			insertAtBeginning(val);
			return;
		}

		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos; i++) { //jump to the prev node
			temp=temp.next;
			if(temp==null) {
				throw new IndexOutOfBoundsException("Invalid Pos "+ pos);
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

	public void deleteAtPos(int pos) {

		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		if(pos==0) {
			head=head.next;
			return;   //not to execute further
		}
		Node temp = head;
		Node prev = null;

		//jump till node to be deleted
		for(int i=1;i<=pos;i++) {
			prev = temp; //keep track of prev node
			temp = temp.next; //jump to next node

		}
		prev.next = temp.next; //reassign pointers

	}

	public void deleteAtBegining() {
		if(head==null)
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");

		head = head.next;
	}
	
	public void getAnPosition(int pos) {
		Node temp = head;
		
		for(int i=0; i<=pos;i++) {
			temp = temp.next;
			System.out.println(temp.data);
		}
	}
	
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current!=null) {
			
			next =current.next;
			current.next=prev; //reverse link
			prev = current;
			current = next;
		}
		head = prev;
	}


	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>() {

			Node temp = head;
			public	boolean hasNext() {
				return temp!=null;
			}
			public T next() {
				T val = temp.data;
				temp = temp.next;
				return val;
			}
		};
	}



}
