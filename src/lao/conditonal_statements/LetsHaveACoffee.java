package lao.conditonal_statements;

public class LetsHaveACoffee {

	boolean isCupEmpty=true;
	
	public static void main(String[] args) {

		LetsHaveACoffee coffee = new LetsHaveACoffee();
		
		if(coffee.isCupEmpty) {   //true
			System.out.println("Fill the cup");
		} else {
			System.out.println("Drink the coffee");
		}
		
	}

}
