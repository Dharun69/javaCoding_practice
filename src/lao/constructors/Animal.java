package lao.constructors;

public class Animal {

	String animalName;
	String animalType;
	
	Animal(String name, String type){
		animalName =name;
		animalType = type;
	}
	
	 void sayAboutAnimal() {
		 System.out.println("The animal name is "+ animalName + " and the animal type is "+ animalType);
	 }
	public static void main(String[] args) {

		Animal animal1 = new Animal("Duck", "omniores");
		animal1.sayAboutAnimal();
		
		Animal animal2 = new Animal("carls", "AlwaysEating");
		animal2.sayAboutAnimal();
	}

}
