package lao.constructors;

public class DefaultConsStudent {
	
	String student_name;

	int rollNo;
	
	Integer sNO;
	

	
	//Example for default constructor.
	
	public static void main(String[] args) {

		DefaultConsStudent S = new DefaultConsStudent();
		System.out.println(S.student_name);
		System.out.println(S.rollNo);
		System.out.println(S.sNO);
	}

}
