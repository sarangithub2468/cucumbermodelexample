package practice;

public class Reverseastring {

	public static void main(String[] args) {

//1) Using StringBuffer class

		StringBuffer sbf = new StringBuffer("Saran");

		StringBuffer text = sbf.reverse();

		System.out.println(text);

//2) Using iterative method
		
		String text1 =  "Saran";
		//System.out.println(text1);
	  char[] textarray = text1.toCharArray();
	  System.out.println(textarray.length);
	  
		for(int i=textarray.length-1;i>=0;i--) {
			System.out.print(textarray[i]);
		}
//3) Using recursive method.
		
/*		String recursiveMethod(String text11)
	    {
	         if ((null == text11) || (text11.length() <= 1))
	         {
	                return text11;
	         }
	 
	         return recursiveMethod(str.substring(1)) + str.charAt(0);
	    }
	

	}

	private static char recursiveMethod(String substring) {
		// TODO Auto-generated method stub
		return 0;*/
	}
}

		

