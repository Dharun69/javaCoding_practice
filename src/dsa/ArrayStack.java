package dsa;

public class ArrayStack  {

	static final int Maxsize = 30;
	int arr[] = new int[Maxsize];

	int top;

	ArrayStack() {

		top =-1;
		
	}
	
	void push(int val) {
		if(top==Maxsize-1)
			throw new IndexOutOfBoundsException("Stack is overflow");
		arr[++top]=val;
	}
	
	int pop() {
		if(top==-1)
			throw new IndexOutOfBoundsException();
		return arr[top--];   //return the value and then decrement the array
		
	}
	
	int peek() {
		return arr[top];
		
	}
	
	boolean isEmpty() {
		return top==-1;
		
	}
}
