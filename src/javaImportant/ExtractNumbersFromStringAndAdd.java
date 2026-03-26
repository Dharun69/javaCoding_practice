package javaImportant;

public class ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {

		String given ="Dharun44";

		int total = 0;

		for(int i=0; i<given.length(); i++) {
			char ch = given.charAt(i);

			if(Character.isDigit(ch)) {
				total = total +	Character.getNumericValue(ch);
			}

		}
		System.out.println(total);
	}

}
