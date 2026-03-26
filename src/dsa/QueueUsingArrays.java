package dsa;

public class QueueUsingArrays {

	static final int maxSize = 30;
	int arr[];
	int front,rear;
	
	public QueueUsingArrays() {

		arr = new int[maxSize];
		front=-1;
		rear = -1;
		
	}
	
	public void enqueue(int val) {
		
		if(rear ==maxSize-1)
			throw new IndexOutOfBoundsException("Queue is full");
		if(front==-1)
			front++;
		arr[++rear]= val;  
	}
	
	public int dequeue() {
		if(front==-1 || front>rear)
			throw new IndexOutOfBoundsException("Queue is empty");

		return arr[front++];
		
	}
	
}
