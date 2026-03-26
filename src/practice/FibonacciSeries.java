package practice;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num=5;
		int first=0;
		int second=1;
		int next;
		
		for(int i=0; i<=num; i++) {
			System.out.println(first);

			next = first+second;
			first= second;
			second=next;
			
		}
		
	}

}
