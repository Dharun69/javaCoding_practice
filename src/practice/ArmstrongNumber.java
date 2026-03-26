package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {

		//153==1^3+5^3+3^3=1*1*1+5*5*5+3*3*3=1+125+27=153
		
		int num = 183;
		int acutalNum = num;
		double result = 0;
		
		while(acutalNum !=0) {
			int n = acutalNum%10;
			result = result + Math.pow(n, 3);
			acutalNum = acutalNum/10;
		}
		
		if(result==num) {
			System.out.println(num + " is a armstrong");
		} else {
			System.out.println(num + " is not a armstrong");
		}
	}

}
