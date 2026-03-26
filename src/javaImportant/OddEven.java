package javaImportant;

import java.util.Scanner;

public class OddEven {

	public void usingScanner() {
		int no;
		Scanner scanner = new Scanner(System.in);
		no=scanner.nextInt();
		
		if(no%2==0)
			System.out.println(no + " is even");
		else
			System.out.println(no + " is odd");
	}
	
	
	public static void main(String[] args) {

		int[] num = {1,5,8,6,10,54,57};
		
		
		
System.out.println("Odd Numbers");
		for(int i=0; i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
				
			}
	
	}
		System.out.println("Even Numbers");

		for(int i=0; i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
	}
}}