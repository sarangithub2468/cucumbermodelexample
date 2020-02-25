package com.lao.javalearning;

public class StaticKeyword {
	
	/*
	block {}
	static key wprd used for class , variable ,methid and block
	jave - object oriented 
	
	static is little exception - 
	for one class- 10 objects 
	
	static keyword - not dependent on all obkec - independent for allclassed
	we can access without any object
	if we write method - 
	system calll=s manin methd autmaticallt sincw static keyworkd in the mainmethod
	wec can call variable or method without calling the object
	//
	
	*/
	
	public static void method1() {
		System.out.println("static");
	}
	
	public void nonstatic() {
		method1(); // wecan call static method from non staticmethod but otherwise
		
	System.out.println("non static method");
			}

	public static void main(String[] args) {

		 method1();
		 //nonstatic();  // we cannot call the non static methos 
		 StaticKeyword obj = new StaticKeyword();
		 obj.nonstatic();
		 
	}

}
