package javaImportant;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "HELLO, I am Dharun";


		char[] charArray =	input.toCharArray();
		for(int i=0;i<input.length();i++) {
					
			
			if(charArray[i]>='A'&&charArray[i]<='Z') {  //if(charArray[i]>='a'&&charArray[i]<='z' lower to upper case
 
				charArray[i]= (char) (charArray[i]+32);   //charArray[i]= (char) (charArray[i]-32);

					}

		}
		for(int i=0;i<input.length();i++) {
			System.out.print(charArray[i]);
		}

	}

}
