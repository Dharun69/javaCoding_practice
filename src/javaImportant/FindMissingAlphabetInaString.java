package javaImportant;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInaString {

	public static void main(String[] args) {

		String given="a";
		
		given = given.toLowerCase();
		given= given.replaceAll(" ", "");
		
		String[] userArray = given.split("");
		
		String[] alphabets = "qwertyuiopasdfghjklzxcvbnm".split("");
	
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(userArray));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));

		set2.removeAll(set1);
		System.out.println(set2);
	}

}
