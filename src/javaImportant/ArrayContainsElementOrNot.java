package javaImportant;

public class ArrayContainsElementOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,3,5,8,6};
		int numberTofind=3;
		boolean found=false;
		for(int number:array) {
			if(number==numberTofind) {
				found = true;
				System.out.println("number present "+ found);
				//break;
			}
		}

	}

}
