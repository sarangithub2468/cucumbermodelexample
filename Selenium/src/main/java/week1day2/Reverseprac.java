package week1day2;

import java.util.Arrays;

public class Reverseprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {2,3,4,5,6,8,9,7};
		System.out.println(num.length);
		Arrays.sort(num); 
		//for(int eachnum : num) {
			//System.out.println(eachnum);
		//}
		for(int i = 2;i<num.length-1;i++) {
			System.out.println(i);
		}
       
		

	}

}
