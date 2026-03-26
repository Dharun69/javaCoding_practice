package lao.string_concepts;

public class StringExamples {

	public static void main(String[] args) {

		String name = "dharunrocks";
		int number=3;
		//returns charcter value for the particular index
		
		System.out.println("Returns char value for the particular index " + name.charAt(0));
		
		//returns string length
		System.out.println("returns string length "+name.length());
		
		//check the equality of string with the given object.
		System.out.println("check the equality of string with the given object "+name.equals("dharun"));
		
		//check the equality of string with the given object.
		System.out.println("check the equality of string with the given object "+name.equalsIgnoreCase("DHAR"));
		
		//checks if string is empty or not
		System.out.println("checks if string is empty or not "+name.isEmpty());
		
		//returns true or false based on the given value is present of not.
		System.out.println("returns true or false based on the given value is present of not "+name.contains("a"));
		
		//take a particular portion of the string
		System.out.println("take a particular portion of the string "+name.substring(3));
		
		//take a particular porstion of the string begin and end index
		System.out.println(name.substring(1,3));
		
		//appends the string to the given string
		System.out.println(name.concat("rocks"));
		
		//replace the existing char with given char
		System.out.println(name.replace("r", "e"));
		System.out.println(name.replace("r", "carls"));
		
		//find the position of a charcter in the string
		System.out.println(name.indexOf("r"));
		
		//find the character specified from the index position
		System.out.println(name.indexOf("r",2));
		
		System.out.println(name.indexOf("rock",0));
		
		//trim will remove the white spaces before and after
		System.out.println(name.trim());
		
		//convert the given data type to String
		System.out.println(String.valueOf(number));
		
		String uppercase = "DHARUN";
		System.out.println(uppercase.toLowerCase());
		
		String lowerCase = "dharun";
		System.out.println(lowerCase.toUpperCase());
		
		//returns a joined string with given delimiter
		System.out.println(String.join("-", "learn", "automation"));
		System.out.println(String.join("/", "07","06","2022"));
		
		//split
		String splitThis = "Am,I,Teaching,good?";
		String[] splittedWords = splitThis.split(",");
		for (String string : splittedWords) {
			System.out.println(string);
		}
	}

}
