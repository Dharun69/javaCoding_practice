package lao.polymorphism;

public class Son extends Parents {

	@Override
	public void marriage() {
		System.out.println("My marriage my rules!");
	}
	
	
	
	public static void main(String[] args) {

		Parents parents = new Son();  // parentclass ref = new childclass();

		
		
		parents.properties();
		parents.marriage();
	}

}
