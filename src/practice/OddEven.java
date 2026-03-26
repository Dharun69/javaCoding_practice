package practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number :");
	
		num= s.nextInt();
		
		 
			if(num%2==0) {
				System.out.println("Even");
			} else if(num%2!=0) {
				System.out.println("Odd");
			}
	}
	
	
	}


