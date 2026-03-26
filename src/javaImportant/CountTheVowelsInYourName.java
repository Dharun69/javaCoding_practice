package javaImportant;

public class CountTheVowelsInYourName {

	public static void main(String[] args) {

		String input="Dharun";
		
		int vowelsCount=0;
		input = input.toLowerCase();
		
		for(int i=0; i<input.length(); i++) { // || indicates OR   //&& indicates AND
			char ch = input.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelsCount++;
			}
		
		}	System.out.println(vowelsCount);
		
	}

}
