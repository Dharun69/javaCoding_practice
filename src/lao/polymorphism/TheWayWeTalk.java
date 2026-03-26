package lao.polymorphism;

public class TheWayWeTalk {

	//This class is to illustrate method overloading with a practical Example

	public void talk(Parents styleOfTalking) {
		System.out.println("Polite, Respectful");
	}

	public void talk(partner styleOfTalking) {
		System.out.println("Love, Romantice, Mixture of everything");
	}
	public void talk(Boss styleOfTalking) {
		System.out.println("Nothing personal");	
	}


	public static void main(String[] args) {

		TheWayWeTalk talk = new TheWayWeTalk();
		Parents parents = new Parents();
		talk.talk(parents);
		
		partner partner = new partner();
		talk.talk(partner);
		
		Boss boss = new Boss();
		talk.talk(boss);

	}

}
