package lao.polymorphism;

public class Addition {
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}

	float add(float n1 , float n2) {
		return n1+n2;
	}
	public static void main(String[] args) {

		Addition addition = new Addition();
		System.out.println(addition.add(25, 45));
		System.out.println(addition.add(54, 064, 064));
		System.out.println(addition.add(654, 4.564f));
	}

}
