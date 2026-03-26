package lao.static_keyword;

public class StaticMethods {

	public static void method1() {
		System.out.println("Static method");
	}
	public void nonStatic() {

		method1();
		System.out.println("Non static");
	}
	public static void main(String[] args) {
		method1();

		StaticMethods s = new StaticMethods();
		s.nonStatic();

	}

}
