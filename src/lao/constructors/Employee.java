package lao.constructors;

public class Employee {

	int employeeId;
	String employeeName;
	
	//Define a No Arg constructor
	Employee() {
 
		employeeId=1;
		employeeName="dharun";
		System.out.println("Employee object is created");
	}
	public static void main(String[] args) {

		Employee employee = new Employee();

	}
	

}
