package lao.static_keyword;

public class StaticVariable {

	// Example to show, static variable are shared among objects.
	
	static int accountBalance=0;
	String despositedBy;
	
	public static void main(String[] args) {

		StaticVariable object1 = new StaticVariable();
		object1.accountBalance=1000;
		object1.despositedBy="dharun";
		
		StaticVariable object2 = new StaticVariable();
		object2.accountBalance=2000;
		object2.despositedBy="carl";
		
		System.out.println("object1 integer:"+object1.accountBalance);
		System.out.println("object1 string:"+object1.despositedBy);
		System.out.println("object2 integer:"+object2.accountBalance);
		System.out.println("object2 string:"+object2.despositedBy);
	}

}
