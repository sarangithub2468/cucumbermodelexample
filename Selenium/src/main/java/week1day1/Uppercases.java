package week1day1;

public class Uppercases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "KousHik";
		System.out.println(name);
		int namelength =  name.length();
		System.out.println(namelength);
			
		char[] chararray = name.toCharArray();
		for(char c :chararray) {
			System.out.println(c);
		}
		
	   String uppercasename = name.toUpperCase();
	   System.out.println(uppercasename);
		char[] upperchararray = uppercasename.toCharArray();
		for(char upperc : upperchararray) {
			System.out.println(upperc);
		}
         int count = 0;
        		 
		for(int i=namelength-1;i>=0; i--) {
			//if(c[i]== upperc[i]){
				//count++;
			}
			//System.out.println(count);

		}
	}


