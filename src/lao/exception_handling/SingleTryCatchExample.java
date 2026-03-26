package lao.exception_handling;

public class SingleTryCatchExample {

	public static void main(String[] args) {

		try {
			int number1=0;
			int number2=3;
			int result = number2/number1;
			System.out.println(result);
		} 
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Don't divide");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("This is due to nullpointer exception");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("can't divide by zero");

		}
	}
}
