package javaImportant;

public class ReplaceVowelsWithDollars {

	public void replaceAll() {
		
		String givenText = "I miss mahendra singh dhoni";

		String replacedText = givenText.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replacedText);
	}
	
	public void customized() {
		String given = "I miss mahendra singh dhoni";
		
		char[] array = given.toCharArray();
		
		for(int i=0; i<given.length(); i++) {
			if(given.charAt(i)=='A' || given.charAt(i)=='E' || given.charAt(i)=='I'
					|| given.charAt(i)=='O'|| given.charAt(i)=='U' ||
					given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i'
					|| given.charAt(i)=='o'|| given.charAt(i)=='u')
				array[i]='*';
		}
		System.out.println(array);
		
		
		
	}


	
	
	public static void main(String[] args) {

		
		ReplaceVowelsWithDollars dollars = new ReplaceVowelsWithDollars();
		
		dollars.replaceAll();
	}
}
