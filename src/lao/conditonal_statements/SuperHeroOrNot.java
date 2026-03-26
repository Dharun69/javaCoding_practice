package lao.conditonal_statements;

public class SuperHeroOrNot {

	String hero = "iron man";
	
	public void heroOrNot() {
		switch (hero) {
		case "iron man":
			System.out.println("iron man is a super hero");
			break;
		case "bat man":
			System.out.println("bat man is a super hero");
			break;
		
		default:
			System.out.println(hero + "I don't know");
			
		}
	}
	
	public static void main(String[] args) {

		SuperHeroOrNot hero = new SuperHeroOrNot();
			
		hero.heroOrNot();
		
		
	}

}
