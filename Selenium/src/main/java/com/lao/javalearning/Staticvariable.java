package com.lao.javalearning;

public class Staticvariable {
	
	
	//only a singel copy of sttaic variable
	
	//variable having static keyword - static variable
	static int accountbalance =500;     
	static String depositedby;
	
	
	public static void main(String[] args) {

		//Staticvariable obj1 = new Staticvariable();
				
		accountbalance=100;
		depositedby="545";
		System.out.println(accountbalance);
		
	}



		
	
}
