package dsa;

public class DemoQueueUsingArrayAndLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingArrays q = new QueueUsingArrays();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println("Dequeued "+ q.dequeue());
		System.out.println("Dequeued "+ q.dequeue());
		System.out.println("Dequeued "+ q.dequeue());
		//System.out.println("Dequeued "+ q.dequeue());

		
		QueueUsingLL ll = new QueueUsingLL();
		
		ll.enqueue(1);
		ll.enqueue(2);
		ll.enqueue(3);
		
		System.out.println(ll.dequeue());

	}

}
