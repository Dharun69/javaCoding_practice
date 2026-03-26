package lao.conditonal_statements;

public class WhosTheHero {
	
	String myheroName = "Superman";

	public void superHeroGuesser() {
		if(myheroName.equals("Captain America")) {
			System.out.println("Your thought about Captain America");
			} else if (myheroName.equals("thor")) {
				System.out.println("Your thought about thor");
			} else if (myheroName.equalsIgnoreCase("Superman")) {
				System.out.println("Your thought about superman");
			} else {
				System.out.println("sorry I can't guess!");
			}
	
	}
	
	public static void main(String[] args) {

		WhosTheHero hero = new WhosTheHero();
		hero.superHeroGuesser();
		
	}

}
