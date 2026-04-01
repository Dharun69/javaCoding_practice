package practice;

public class NumberOfDigits {

	public static void main(String[] args) {

		//1234 = 4

		int given = 654654;
		int digit=0;
		
		while(given!=0) {
			given = given/10;
			digit++;
		}
		System.out.println(digit);

		
}
}