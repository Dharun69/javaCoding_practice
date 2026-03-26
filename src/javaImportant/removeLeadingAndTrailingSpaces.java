package javaImportant;

public class removeLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="  hello brother  ";
		System.out.println(input);
		
		String trim = input.trim();
		
		System.out.println(trim);
		
		System.out.println(input.strip());
		
		System.out.println(input.replaceAll("^[ \t]+|[ \t]+$", ""));
	}

}
