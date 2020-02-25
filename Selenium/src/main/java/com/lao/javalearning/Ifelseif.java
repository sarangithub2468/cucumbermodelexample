package com.lao.javalearning;

public class Ifelseif {
	//of else of for multiple conditions checking
	String heronam = "ironman";
	
	//for guessing heroname 
			
	public void heroguesser() {
		if(heronam.equals("batman")) {
			System.out.println("guess is batman");
		}
		else if(heronam.equals("ironman")) {
			System.out.println("guess is ironman");

		}
		else if(heronam.equals("thor")) {
			System.out.println("guess is thor");
		}

		else {
			System.out.println("i cant guess");
		}
	}
	//equals -  vale=ue should be exact wqual 
	// in case case sensitivity prob - flase will rerurn'
	//if case c=sensitive is not a prob ise equals .ignore case
	//if there are 50 confition- for multiple conditions we use switch
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelseif obj = new Ifelseif();
		obj.heroguesser();
	}

}
