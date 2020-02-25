package week1day2;

import java.util.Arrays;

public class Arrayssorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {100,200,50,25,40,90,120,5,1,2,3,9,8,8,7,8,8,9,5};
		
		int length = num.length;
		System.out.println(length);
		System.out.println("----**");
        Arrays.sort(num);
        for(int newnum : num) {
        	System.out.println(newnum);
        	
        }
       
	}

}
