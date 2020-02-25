package com.lao.javalearning;

public class Switchcase {

	
	String superhero ="captainamerica";
	
    public void superheroornot() {
    	
    	switch (superhero) {
		case "captainamerica"	:
			System.out.println("captainamerica is superhero");
			break;
		case "superman"	:
			System.out.println("superman is superhero");

		case "batman"	:
			System.out.println("batman is superhero");

		default:
			System.out.println(superhero + " not found");
		//default is if all conditions are not satisfied - default wjat should we do- we write it here
		}   	
    	
    	}
				
	//swithc case for multipe conditions
    // if one case satisfied - all other cases will also executed 
    //in if else - one cinditoon satisfied itehr case will not get execur=ted
    //In switch case all other cases will be excuted so for avoiding this we use break .
    //of there or more than 5 or 6 conditons ise swithc
  //  if 2 or 3 - ifleseif
  //  if 1 0r 2 -if is enough
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchcase obj = new Switchcase();
			obj.superheroornot();
		}
	}


