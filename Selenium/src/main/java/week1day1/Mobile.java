package week1day1;

public class Mobile {
	
	public void dialCall() {
		//System.out.println("I am dialing the number");
		int n = 2468;
		System.out.println("I am dialing the number" +n);

	}
	public long deleteNumber() {
		return 2468;
	}
	
    public String getmobileInfo() {
    	return("Black");
    }
    public String saveContactName() {
    	return("john");
    }
//calling the class
   public static void main(String[] args) {
	
	   Mobile myMobile = new Mobile();  	   
	   String info = myMobile.getmobileInfo();
	   System.out.println(info);
       
       //myMobile.saveContactName();
	   String contact = myMobile.saveContactName();
	   System.out.println(contact);
	   
	   myMobile.dialCall();
	   long num = myMobile.deleteNumber();
	   System.out.println("Delete the number" +num);
	  

    }    
  }
