package week1day1;


public class Greatest3nos {
	
	int a=5;
    int b=10;
    int c=4;
    
	public void greatestnosofall() {
	
	if((a>b)&&(a>c)) {
		System.out.println("a is the greatest of all");
	}
	if((b>a)&&(b>c)) {
		System.out.println("b is the greatest of all");
	}
	if((c>b)&&(c>a)) {
		System.out.println("c is the greatest of all");
	}
	else {
		System.out.println("All are equal");
		}
	}
	public static void main(String[] args) {
		
	
	Greatest3nos checkgreatest = new Greatest3nos();
			
			checkgreatest.greatestnosofall();
	
	}
}
