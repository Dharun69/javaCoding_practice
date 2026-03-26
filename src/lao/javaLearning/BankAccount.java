package lao.javaLearning;

public class BankAccount {
	
	Long accountNumber = 51651651651651l;
	
	String holderName = "dhar";
	
	int accountBalance = 354;
	

	public void getBalance() {
		System.out.println("Balance is "+ accountBalance );
	}

	
	public static void main(String[] args) {
 //ClassName objName = new Classname();

		BankAccount account = new BankAccount();
		account.getBalance();
		
		
		
	}

}
