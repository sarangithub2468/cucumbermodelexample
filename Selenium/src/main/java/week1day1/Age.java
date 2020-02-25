package week1day1;

public class Age {	

	int i=17;
		public void agecheck() {
		
		if(i<=18) {
			System.out.println("child");
		}
		else if(i>59){
			System.out.println("Senior Citizen");
		}

		else {
			System.out.println("adult");

		}
		}
public static void main(String[] args) {
	    Age ageverify = new Age();
		ageverify.agecheck();	
		
}

}

//within the main method without calling the new object and class

/*package week1day1;

public class Age {

	public static void main(String[] args) {
		int i = 17;

		if (i <= 18) {
			System.out.println("child");
		} else if (i > 59) {
			System.out.println("Senior Citizen");
		}

		else {
			System.out.println("adult");

		}
	}

}






  */