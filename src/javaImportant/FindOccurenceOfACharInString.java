package javaImportant;

public class FindOccurenceOfACharInString {

	public void usingForLoop() {

		String input="hapyy";

		char toFind ='y';

		int occurence=0;

		input =	input.toLowerCase();

		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==toFind) {
				occurence++;
			}
		}
		System.out.println(toFind + " is present " + occurence + " number of times");
	}




	public static void main(String[] args) {
		FindOccurenceOfACharInString occurence = new FindOccurenceOfACharInString();
		occurence.usingForLoop();

	}

}
