package lao.abstraction;

public class Benzabst extends Carabst{


	@Override
	public void engineSecret() {
		System.out.println("benz Engine secret");
	}
	@Override
	public void companyValut() {
		System.out.println(" benz company valut");
	}

	public void driving() {
		System.out.println("driving");
	}

	public static void main(String[] args) {
		//Benzabst car = new Benzabst(); // early binding or static binding
		Carabst car = new Benzabst();  //only access the base class methods // base class reference and derived class object.
		//late binding or dynamic binding 

		car.companyValut();
		car.engineSecret();
		car.emply();

	}

}
