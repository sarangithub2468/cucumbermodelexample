package com.lao.javalearning;

public class BankAccount {
//for long numbers this is better - primitive data type- pink colour - for long end ewith l to append datatypes
	Long accountNum = 12345678901l;
	//this long wraps the value of primitive data types
	String holdername = "saran";
	Integer accountbal = 5000;
	
	//write methid. this will
	public void getBalance() {
		
		System.out.println("Balance is     "+accountbal);
		
	}
	//build in method
	
	public static void main(String[] args) {
//classnmae obj - new classname
		//using object we can access all datatypes and methods, functions
		BankAccount account = new BankAccount();
		account.getBalance();
		//account.accountbal
	}

}
