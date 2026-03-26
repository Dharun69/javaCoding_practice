package javaImportant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

	public void usingStringBuffer() {
		String given = "Dharun";

		
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);

		System.out.println(buffer.reverse());

	}

	public void customized() {

		String value="dhar";
		char[] array = value.toCharArray();
	
		String reverse = "";
		
		for(int i=array.length-1; i>=0; i--) {
			reverse = reverse+array[i];
		}
		System.out.println(reverse);
	
	
	}

	public void usingCollections() {
		String given = "dharr";
		char[] array = given.toCharArray();
		List<Character> list = new ArrayList<Character>();

		for (Character character : array) {
			list.add(character);
		}
		Collections.reverse(list);

		ListIterator iterator = list.listIterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		ReverseAString aString = new ReverseAString();
//		aString.usingStringBuffer();
//		aString.customized();
		aString.usingCollections();
	}
}
