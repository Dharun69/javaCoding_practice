package lao.abstraction;

public class Bmwabst extends Carabst{

	@Override
	public void engineSecret() {
		System.out.println("BMW Engine secret");
	}
	@Override
	public void companyValut() {
		System.out.println(" BMW company valut");
	}
	
	public static void main(String[] args) {
		Carabst car = new Bmwabst();
		car.engineSecret();
		car.companyValut();
	}
}
