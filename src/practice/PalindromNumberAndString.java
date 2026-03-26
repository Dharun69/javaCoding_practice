package practice;

public class PalindromNumberAndString {

	public void palindromForString() {
		String given = "dhar";
		String rev = "";
		String str = given;

		char[] array =	given.toCharArray();
		for(int i=given.length()-1;i>=0;i--) {
			rev = rev+array[i];
		} System.out.println(rev);
		
		if(str==rev) {
			System.out.println(str+ " The String is palindrom");
		} else {
			System.out.println(str + " The String is not palindrom");
		}
		

	}
	
	public void palindromForNumber() {
		int num1 = 425135;
		int rev=0;
		int actalNum = num1;
		while(num1!=0) {
			int remainder = num1%10;
			rev = rev*10+remainder;
			num1= num1/10;
		} System.out.println(rev);

		if(actalNum == rev) {
			System.out.println(actalNum + " is a pallindrom num");

		}else {
			System.out.println(actalNum + " is not a pallindrom num");
		}
	}
	

	public static void main(String[] args) {
		
		PalindromNumberAndString string = new PalindromNumberAndString();
		string.palindromForString();
		
		string.palindromForNumber();

	}

}
