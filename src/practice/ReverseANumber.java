package practice;

public class ReverseANumber {

	public static void main(String[] args) {

		int given= 654654654;
		
		int rev=0;
		
		while(given!=0) {
			
			int remainder = given%10;
			rev= rev*10+remainder;
			given=given/10;
		}System.out.println(rev);
		
		
	}

}
