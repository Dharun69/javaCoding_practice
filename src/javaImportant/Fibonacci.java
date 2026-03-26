package javaImportant;

public class Fibonacci {

	public static void main(String[] args) {

		int given=10;
		int first=0;
		int second=1;
		int next;
		
		for(int i=0; i<given; i++) {
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
		}
	}

}
