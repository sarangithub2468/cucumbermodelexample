package week8day1;
import org.testng.annotations.Test;

public class Reversewhitespacesmaintain {
	String inputString = "this is the world";
	@Test	    
	public void reverse(){
		//https://javaconceptoftheday.com/how-to-reverse-the-string-with-preserving-the-position-of-spaces/

	        //Converting inputString to char array 'inputStringArray'
	         
	        char[] inputStringArray = inputString.toCharArray();
	         
	        //Defining a new char array 'resultArray' with same size as inputStringArray
	         System.out.println(inputStringArray);
	        char[] resultArray = new char[inputStringArray.length];
	       System.out.println("******");
	        System.out.println(inputStringArray.length);

	        //First for loop : 
	        //For every space in the 'inputStringArray', 
	        //we insert spaces in the 'resultArray' at the corresponding positions 
	         
	        for (int i = 0; i < inputStringArray.length; i++) 
	        {
	        	
	            if (inputStringArray[i] == ' ') 

	            {
	                resultArray[i] = ' ';

	            }
	        }
	         
	         System.out.println("**************");
	         System.out.println(resultArray.length);

	        //Initializing 'j' with length of resultArray
	         
	        int j = resultArray.length-1;
	                 
	        //Second for loop :
	        //we copy every non-space character of inputStringArray 
	        //from first to last at 'j' position of resultArray
	         
	        for (int i = 0; i < inputStringArray.length; i++)
	        {
	            if (inputStringArray[i] != ' ') 

	            {
	                //If resultArray already has space at index j then decrementing 'j'
	                 
	                if(resultArray[j] == ' ')

	                {
	                    j--;
	                }
	                 
	                resultArray[j] = inputStringArray[i];
	                 
	                j--;
	            }
	        }
	         
	        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
	    }
}
