package com.lao.javalearning;

public class IFelse {
	
	//if coffee in mug have otehr wise leave
	//boolean datatype - returm true or false
	//if Boolean- wrapper class
	
	boolean iscupempty=false;
	int num;
	//deafuat return typr is zero for int num	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IFelse obj = new IFelse();
		 if(obj.iscupempty) {//true expected === te]rue. it wil,l check if true or not
			 System.out.println("fill the cup");
		 }
		 else {
			 System.out.println("drink the cofee");
		 }
	}

}
