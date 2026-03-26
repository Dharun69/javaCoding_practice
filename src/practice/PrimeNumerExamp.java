package practice;

public class PrimeNumerExamp {

	public static void main(String[] args) {

		int num = 6;
		int i;
		
		if(num==1) {
			System.out.println("The smallest prime is 2");
		}
		
		for(i=2 ; i<num; i++) {
			if(num%i==0) {
				System.out.println("Not a prime number");
				break;
			}
		}
		
		
		if(num==i) {
			System.out.println("Prime number");
		}
	}

}
