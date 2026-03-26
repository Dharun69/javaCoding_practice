package practice;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {

		int num1;
		int num2;
		System.out.println("Enter the num1 :");
		Scanner scanner = new Scanner(System.in);
		num1= scanner.nextInt();
		
		System.out.println("Enter the num2");

		num2= scanner.nextInt();
		
		int num3=num1+num2;
		System.out.println("The added number is :"+ num3);
		
		
	}

}
