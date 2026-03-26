package practice;

public class SumofNaturalNumbers {

	public static void main(String[] args) {

		int num = 5;
		int sum = 0;
		int loopSum=0;
		sum=(num * (num + 1))/2;
		
		System.out.println(sum);
		
		for (int i=1; i<=num; i++) {
			loopSum = loopSum+i;
			
		}
		System.out.println(loopSum);
	}

}
