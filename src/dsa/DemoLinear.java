package dsa;

import java.util.Arrays;

public class DemoLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,7,4,5,8};
		System.out.println(LinearSearch.find(arr, 7));
		
		
		
		String name ="dhar";
		System.out.println(LinearSearch.find(name, 'R'));
		
		
		int[][] twoDArr = {
				{2,5,6},
				{5,7,8},
				{8,9,1}
		};
		

		int[] result =LinearSearch.findd(twoDArr, 7);
		System.out.println(Arrays.toString(result));
		
		
		
	}

}
