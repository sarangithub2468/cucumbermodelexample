package practice;

import java.util.Arrays;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How To Check The Equality Of Two Arrays In Java?
		int[] arrone= {2,4,6,8};
		int[] arrtwo = {2,4,6,8,10};
		
		/*boolean equal = true;
		
		if(arrone.length==arrtwo.length){
			for(int i=0;i<=arrone.length;i++) {
				if(arrone[i] != arrtwo[i]) {
					equal = false;
				}
			}
		}
		else {
			equal = false;
			
		}
		
		if(equal) {
			System.out.println("two arrays are equal");
		}
		else {
			System.out.println("two arrays are not equal");
		}*/
      if( Arrays.equals(arrone, arrtwo)) {
			System.out.println("two arrays are equal");
      }
      else {
			System.out.println("two arrays are not equal");
      }
	}

}
