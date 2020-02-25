package practice;

import java.util.Scanner;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String fname=  in.next();
		System.out.println("Enter your first name" );
		String lname = in.next();
		System.out.println("Enter your last name" );
     System.out.println();
     System.out.println("Hello \n  "+fname+"   "+lname);

	}
}
