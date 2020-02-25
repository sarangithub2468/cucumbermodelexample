package week3day1;


public class Bicycle {
		
	
	public String getcolor()
	{
	return"white";
		//System.out.println("white");
	}
	
	public void fillAir()
	{
		System.out.println("filled");
	}
	public String getcolor(String brandname)
	{
		
		if(brandname.equals("hercules")) {
			System.out.println("grey");
		}
			else {
				System.out.println("yellow");
			}
		return brandname;
	}
	
	public void fillAir(int tyre) {
		if(tyre ==10)
		{
			System.out.println("air filled");
		}
		else {
			System.out.println("air not filled");
		}
	}
public static void main(String[] args) {
	Bicycle cy  = new Bicycle(); 
	cy.fillAir();
	cy.fillAir(10);
	String gy = cy.getcolor();
	System.out.println(gy);
	String by = cy.getcolor("hercules");
	System.out.println(by);
	
}

}


