package dsa;

public class DemoArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStack arrayStack = new ArrayStack();
		
		arrayStack.push(4);
		arrayStack.push(5);
		System.out.println("popped"+ arrayStack.pop());
		System.out.println("peek"+ arrayStack.peek());

		
		StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
		stackUsingLinkedList.push(3);
		stackUsingLinkedList.push(5);

		stackUsingLinkedList.push(6);
		System.out.println("popped"+ stackUsingLinkedList.pop());

	}

}
