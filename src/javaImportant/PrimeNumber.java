package javaImportant;

public class PrimeNumber {

	public static void main(String[] args) {

		int no= 7;
		int i;
		if(no==1) {
			System.out.println("smallest prime is 2");
		}
		for(i=2;i<no;i++) {
			if(no%i==0) {
				System.out.println("Not a prime");
				break;
			}

		}
		if(no==i) {
			System.out.println("prime");
		}

	}
	}
