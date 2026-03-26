package dsa;

public class BinarySearch { //most imp


	public static int search(int [] arr, int target) {

		int start=0;
		int end = arr.length-1;

		boolean asc = false;
		if(arr[start]<arr[end])
	
			asc=true;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(asc) { //asc array
			if(target>arr[mid]) { //focus on right side
				start=mid+1;
			}	
				else if(target<arr[mid]) {//foucs on left side
					end=mid-1;
				} else {
					return mid;
				}
			} else { //for desc
				
				if(target>arr[mid]) { //focus on left side
					end = end-1;
				}	
					else if(target<arr[mid]) {//foucs on right side
						start=start+1;
					} else {
						return mid;
					}
			}
			
		}return -1;



	}

}
