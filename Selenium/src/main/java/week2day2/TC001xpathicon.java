package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001xpathicon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
		//open url 
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//enter username
		WebElement eleUsername = driver.findElementById("username");	
		eleUsername.sendKeys("DemoSalesManager");
	//enter passowrd	
		driver.findElementById("password").sendKeys("crmsfa");
	//click login
		driver.findElementByClassName("decorativeSubmit").click();
	//Click CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click Leads Tab
		driver.findElementByLinkText("Leads").click();
//Click Merge Leads   Merge Leads
		driver.findElementByLinkText("Merge Leads").click();
		//Click To lead icon
		//(//*[@alt="Lookup"])[2]
		//(//a/img[@alt="Lookup"])[2]
		//(//a/img)[5]
     driver.findElementByXPath("(//*[@alt='Lookup'])[2]").click();
     
		
		
		
		
		
		
		
		
		

	}

}
