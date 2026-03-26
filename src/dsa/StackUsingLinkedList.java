package dsa;

public class StackUsingLinkedList {

	class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}

	}
	Node top;

	StackUsingLinkedList(){
		top = null;
	}

	public void push(int val) {  //O(1)
		Node newNode = new Node(val);
		newNode.next = top;
		top = newNode;

	}

	public int pop() {
		if(top==null)
			throw new IndexOutOfBoundsException("Stack is empty");
		int temp = top.data;
		top = top.next;
		return temp;
	}
	public boolean isEmpty() {
		return top==null;
	}
	
	public int peek() {
		return top.data;
	}
}
