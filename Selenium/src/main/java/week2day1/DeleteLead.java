zxxj package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
		//open url 
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//enter username
		WebElement eleUsername = driver.findElementById("username");	
		eleUsername.sendKeys("DemoSalesManager");
	//enter passowrd	
		driver.findElementById("password").sendKeys("crmsfa");
	//click login
		driver.findElementByClassName("decorativeSubmit").click();
	//Click CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
    //click Leads
		driver.findElementByLinkText("Leads").click();
	//Click Find Leads
		driver.findElementByLinkText("Find Leads").click();
	//click phone no:
		driver.findElementByXPath("//span[text()='Phone']").click();;
		//name="phoneNumber"
	// enter phone number text
		driver.findElementByName("phoneNumber").sendKeys("2");
	//click find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	    Thread.sleep(3000);	
     //click first link text
		//class="linktext"
	    driver.findElementByXPath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"])[1]/a").click();
	//click delete
		driver.findElementByLinkText("Delete").click();
	//close browser
		driver.close();
		
	}

}
