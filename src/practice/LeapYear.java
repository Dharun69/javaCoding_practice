package practice;

public class LeapYear {

	public static void main(String[] args) {

		//division by 4 for all the century years-- ending with 00
		
		//century year is leap year only when its perfectly division by 400.
		
		int year=2020;
		boolean leap=false;
		
		if(year % 4 ==0) {  //checking it's divisible by 4
			if(year %100 ==0) {  //checking the double zero
				if(year % 400 ==0) { //checking centruy year is leap or not by 400
					leap =true;
				}else {
					leap=false;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}
		if(leap) {
		System.out.println(year+ " is a leap year");
	}else {
		System.out.println(year + " is not a leap year");
	}
	}
}
