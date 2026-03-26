package javaImportant;

import java.util.HashSet;
import java.util.Set;

public class Prac {

	public static void main(String[] args) {



		String str[] = {"java", "python", "C", "java"};
		
				

	
	
		Set<String> store = new HashSet<String>();
		
		
		for (String string : store) {
			if(store.add(string)==false) {
				System.out.println(string);
			}
		}

		
		int num = 654654;
		
		int rev=0;
		
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}System.out.println(rev);
		
		
	}
	

}