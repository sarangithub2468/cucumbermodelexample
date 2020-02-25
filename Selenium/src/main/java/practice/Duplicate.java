package practice;

import java.util.HashMap;
import java.util.Map;

//4) How to find duplicate characters in a string in java?


public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> charcount = new HashMap<Character, Integer>();
              String str = "novooo";
              char[] strarray = str.toCharArray();
           //checking each char of strArray
       for(char c :strarray ) {
    	   if(charcount.containsKey(c)) {
    		   charcount.put(c, charcount.get(c)+1);
    		   System.out.println(charcount.get(c));
    		   System.out.println(c);
    	   }
    	   else {
    		   charcount.put(c, 1);
    	   }
       }
       System.out.println(charcount);
		
     /*//Getting a Set containing all keys of charCountMap
       
       Set<Character> charsInString = charcount.keySet();

       System.out.println("Duplicate Characters In "+str);

       //Iterating through Set 'charsInString'

       for (Character ch : charsInString)
       {
           if(charcount.get(ch) > 1)
           {
               //If any char has a count of more than 1, printing it's count

               System.out.println(ch +" : "+ charcount.get(ch));
           }
       }*/
   }
		
	}


