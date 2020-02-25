package com.lao.javalearning;

public class Loops {

	 /*
	  * for, 
	  * while,
	  * do while
	  * //for loop
		//initializzation - how many times should happen . start from zero
		//condition  time till 25
		//increment or decrement // increse should till 25 0 to 25
		// if 0<25- exe
	i can learn i can program - 25 times write 
		for loop -
		no condition - in finite loop
		//while - initialization separate, cinditoj separate will occur
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(int times=0;times<25;times++) {
			System.out.println("run 25 times");
		}
		int times=0;
		while(times<25) {
			System.out.println("i can program, i can learn");
			times++;
		}
		
	//do while
		// do frst 
		//while - entry controlled loop - checked the condition and take to run
		//do whie- exit controlled loop - not cjeckked the condition  - 1 day allowed and checked the conf=dition later
		//so do while is exit controlled loop
		
		
		//int times=0;
		do {
			System.out.println("ican");
			times++;
		} while (times<25);
		
		
		
	}

}
