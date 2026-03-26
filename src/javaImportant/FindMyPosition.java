package javaImportant;

import java.util.Scanner;

public class FindMyPosition {

	public void findMyPosition() {
		//To find the position of the given English alphabet

		//ASCII 97 -->a, 65-->A

		//ASCII code for A to Z starts from 65(A) to 90(Z)
		//And for lower case it�s start from 97(a) to 122(z) 

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your character ");

		char givenChar =	scanner.next().charAt(0);
		
		givenChar = Character.toUpperCase(givenChar);
		
		int asciiValue =(int) givenChar;
		System.out.println(asciiValue);
		int position = asciiValue -64;
		
		System.out.println(position);


	}
	
	public void countUpperLower() {
		String str;
		int lower = 0;
		int upper = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		
		str= scanner.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upper++;
			}
			else if(ch>='a'&&ch<='z') {
				lower++;
			}
		}
		System.out.println("Lowercase letters "+ lower);
		System.out.println(" Uppercase letters"+ upper);
		
	}

	public static void main(String[] args) {

		FindMyPosition find = new FindMyPosition();
	find.findMyPosition();
find.countUpperLower();



	}

}
