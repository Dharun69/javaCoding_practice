package lao.string_concepts;

public class StringBufferExamples {

	public static void main(String[] args) {

		System.out.println("String is Immutable");
		String name = "Dharun";
		System.out.println("Appending a name to original " + name.concat("Rocks"));
		System.out.println("Orginal Name " + name);

		System.out.println("Stringbuffer is Mutable");
		StringBuffer name1 = new StringBuffer("Dharun");
		System.out.println("Appending a name to original "+ name1.append("Rocks"));
		System.out.println("Original Name "+name1);

		//StringBuffer Methods
		//Reverse
		System.out.println("Reversed name: "+ name1.reverse());

		//replace
		StringBuffer replaceThis = new StringBuffer("Dharun");
		System.out.println(replaceThis.replace(0, 3, "carls"));

		//delete
		StringBuffer delete = new StringBuffer("444Dharun");
		System.out.println(delete.delete(0, 3));

		StringBuffer insert = new StringBuffer("dha");
		System.out.println(insert.insert(3, "run"));
		
		//capacity
		System.out.println(insert.capacity());
		
		//Like string we have chartAt, substring, length methods as well
	}

}
