package practice;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int y=300;
		int z=250;
		
		if(x>y && x>z) {
			System.out.println("x is the greatest");
		}else if(y>x && y>z) {
			System.out.println("Y is the greatest");
		}else if(z>x && z>y) {
			System.out.println("z is the greatest");
		}
	}

}
