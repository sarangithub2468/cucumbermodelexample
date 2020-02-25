package com.lao.javalearning;

public class Staticblock {
	//static block is the block of code which additionally has keyword static
	static {
		System.out.println("static1");
	}
	
	static {
		System.out.println("static2");
	}
	//main methid will run after static method runs

	
// why static block - cfor intitializing value to statc variable  static block is used

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
System.out.println("main method");
	}

}
