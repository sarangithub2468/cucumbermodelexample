package week1day1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empid = {1,2,3,5,4,8,14};
		int length =  empid.length;


		Arrays.sort(empid);
		for(int eachnum : empid) {
			System.out.println(eachnum);
		}
		System.out.println("descending");
		for(int i=length-1;i>=0;i--) {
			System.out.println(empid[i]);

		}
	}

}

