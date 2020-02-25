package com.lao.javalearning;

public class Collectamount {
	
	
	public Integer collectedamount = 1000;
	 
	public Integer collectamountandgive() {
		System.out.println("Collected amount " +collectedamount);
		return collectedamount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collectamount obj = new Collectamount();
		Integer amount = obj.collectamountandgive();
		System.out.println(amount);
	}

}
