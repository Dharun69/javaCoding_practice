package javaImportant;

import java.util.Scanner;

public class SwapTwoNumbers {

	public void usingThirdVariable() {
		
		int mySalary = 20;
		int superiorSalary = 50;
		
		System.out.println("Before swapping "+ "Mine "+ mySalary + "Superior "+ superiorSalary);
		int temp=mySalary;
		
		mySalary=superiorSalary;
		
		superiorSalary=temp;
		
		System.out.println("After swapping "+ "Mine "+ mySalary + "Superior "+ superiorSalary);
	}
	
	public void withoutUsingThirdVarible() {
		
		//int first=20; int second=50;
		int a; int b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number :");
		a=s.nextInt();
		
		System.out.println("Enter the second number :");
		b = s.nextInt();
		
		//System.out.println("Before swapping "+ "first "+first + "second "+second);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+ "first "+a + "second "+b);
		
	}

	/*
	 * first= first- second second= first+second first=second-first
	 * 
	 * first= first*second second=first/second first=first/second
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers numbers = new SwapTwoNumbers();
		numbers.usingThirdVariable();
		numbers.withoutUsingThirdVarible();
	}

}
