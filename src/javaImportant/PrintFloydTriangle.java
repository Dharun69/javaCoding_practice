package javaImportant;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PrintFloydTriangle {

	public void usignStar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		
		int numberOfLines = scanner.nextInt();
		
		int row, column=0;
		
		for(row=0; row<numberOfLines; row++) {
			for(column=0;column<=row;column++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void usingNumber() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int startingNumber=1;
		int limit;
		limit=scanner.nextInt();
		
		int row, column;
		
		for(row=0;row<limit; row++) {
			for(column=0;column<=row;column++) {
				System.out.print(startingNumber+" ");
				//startingNumber=startingNumber+1;
				startingNumber++;	
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {

		PrintFloydTriangle floydTriangle = new PrintFloydTriangle();
		floydTriangle.usignStar();
		floydTriangle.usingNumber();
	}

}
