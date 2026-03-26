package lao.looping;

import java.util.Scanner;

public class LoopExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prints the even numbers between 1 and 100 in an increasing order and decreasing
	
		
	//108---1+0+8
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		
		int no = scanner.nextInt();
		
		int sum=0;
		while(no!=0) {
		
			sum = sum + no%10;
			no = no/10;
			
		}System.out.println(sum);
		
			
		
		
		
	}

}
