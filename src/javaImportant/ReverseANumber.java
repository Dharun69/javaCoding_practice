package javaImportant;

import java.util.Scanner;

public class ReverseANumber {


	public void reverse() {
		int givenNumber=0;
		int reversedNumber=0;

		System.out.println("Enter your number :");

		Scanner scanner = new Scanner(System.in);
		givenNumber=scanner.nextInt();

		while(givenNumber!=0) {
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
		}
		System.out.println(reversedNumber);

	}


	public void givenNumber() {
		
		int given = 59633962;
		
		int reverse = 0;
		
		while(given!=0) {
			
			int remainder = given%10;
			reverse = reverse*10+remainder;
			given = given/10;
		}
		System.out.println("The reversed number is "+ reverse);
	}


	public static void main(String[] args) {

		ReverseANumber number = new ReverseANumber();
		number.givenNumber();
	//	number.reverse();
	}
}
