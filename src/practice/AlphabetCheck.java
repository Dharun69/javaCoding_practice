package practice;

public class AlphabetCheck {

	public static void main(String[] args) {

		char c = '*';
		
		if(Character.isAlphabetic(c)) {
			System.out.println("The given letter is alphabet");
		 } else
			 System.out.println( "The given letter is not alphabet");
		
		if(( c>='a' && c<='z') ||  (c>='A' && c<='Z')) {
			System.out.println("The given letter is alphabet");
		 } else
			 System.out.println( "The given letter is not alphabet");
		}
		
	

}
