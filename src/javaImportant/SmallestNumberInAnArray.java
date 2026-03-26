package javaImportant;

public class SmallestNumberInAnArray {

	
	int givenArray[]= {5,6,4,9,8};

	public void findSmallest() {
		
		int smallest = Integer.MAX_VALUE;
	
		
		for(int i=0; i<givenArray.length;i++) {
			
			if(givenArray[i]<smallest) {
				
				smallest=givenArray[i];
			}
		}
		System.out.println("Smallest Number is "+smallest);
	}
	
	public void findASmallestAndLargest() {
		
		int [] array= {4,65,7,94,-61,81,99,456,5};
		
		int largest = array[0];
		int smallest = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i]>largest) {
				largest=array[i];
			} else if (array[i]<smallest) {
				smallest=array[i];
			}
		}System.out.println("Smallest number is "+ smallest);
		System.out.println("Largest number is "+ largest);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmallestNumberInAnArray anArray = new SmallestNumberInAnArray();
		anArray.findSmallest();
		//anArray.findASmallestAndLargest();
	}

}
