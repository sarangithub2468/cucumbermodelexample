package week1day1;

public class Arithmetic {
	
//addition program outside main method
   public void addnumbers() {
	int a = 2;
    int b = 5;
    System.out.println("sum" +(a+b));
   }
 //multiplication outside main method
    public float multiplynumbers() {

    int w =4 ;
    float r = 3.5f;
    //System.out.println("multiply" +(w*r));
     float z = w * r;
     return z;
}
public static void main(String[] args) {
		
    	Arithmetic myArithmetic = new Arithmetic();
    	myArithmetic.addnumbers();
    	
    	float mult = myArithmetic.multiplynumbers();
    	System.out.println(mult);
    	
//subtractioninside main method 
    	int num1=6;
    	int num2= 2;
        System.out.println("minus" +(num1-num2));

}
}


