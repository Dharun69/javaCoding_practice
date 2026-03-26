package lao.exception_handling;

public class TryCatchFinallyImportantConcepts {

	public static int dummy() {
		return 3;
	}
	public static void main(String[] args) {

		try {
			System.out.println("Inside try block");
			System.out.println(TryCatchFinallyImportantConcepts.dummy());
			System.out.println(3/0);
			System.out.println("After exception");

		} catch (Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
