package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers :");

		double first = scanner.nextDouble();
		double second = scanner.nextDouble();

		System.out.println("Please enter an operator : (+ , -, * , /) :");


		char operator = scanner.next().charAt(0);
		double result=0;

		switch (operator) {

		case '+' :
			result = first + second;
			break;

		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			result = first / second;
			break;

		default:
			System.out.println("Plese pass the correct operator");
			break;
		}

		System.out.println(result);
	}

}
