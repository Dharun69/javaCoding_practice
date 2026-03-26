package lao.javaLearning;

public class CollectAmount {

	public Integer collectedAmount=1000;
	
	public Integer collectedAmountAndGiveItTOMe() {
		
		System.out.println("Daddy I have collected the amount"+ " collectedAmount "+  " and sent it to you");
		return collectedAmount;
		 
	}
	
	public static void main(String[] args) {

		CollectAmount mySon = new CollectAmount();
		
		Integer amount = mySon.collectedAmountAndGiveItTOMe();
		System.out.println("Got the amount myson " + amount);
	}

}
