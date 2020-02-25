=package week8day1;

import org.testng.annotations.Test;

public class CountUppercase {
	String name = "TestLeaf@123";

			// TODO Auto-generated method stub
		@Test
		public void way1() {
		//way1
		//step1 : using replaceAll()
		String newnameu = name.replaceAll("[^A-Z]", "");
		System.out.println(newnameu.length());
		String newnamel = name.replaceAll("[^a-z]", "");				
		System.out.println(newnamel.length());
		String newnamed = name.replaceAll("[^0-9]","");				
		System.out.println(newnamed.length());
		String newnamespec = name.replaceAll("[A-Za-z0-9]","");				
		System.out.println(newnamespec.length());

		
		//way2
		 
		}
		
		@Test
		public void way2() {
		     char[] a = name.toCharArray();
		      
		
			
		}
	}


