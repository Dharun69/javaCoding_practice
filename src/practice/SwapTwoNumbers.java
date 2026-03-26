package practice;

public class SwapTwoNumbers {

	public void usingThirdVariable() {
		
		
		int first=45;
		int second=89;
		
		int temp = first;
		first=second;
		second=temp;
		System.out.println(first);
		System.out.println(second);
	}
	
	public void withoutUsingThirdVariable() {
		
		int first=56;
		int second=78;
		
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println(first);
		System.out.println(second);
		
	}
	public static void main(String[] args) {
		SwapTwoNumbers numbers = new SwapTwoNumbers();
		numbers.usingThirdVariable();
		numbers.withoutUsingThirdVariable();
	}
	
	
}
