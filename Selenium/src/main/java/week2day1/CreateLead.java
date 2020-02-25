package week2day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
//Click create lead2
	driver.findElementByLinkText("Create Lead").click();
//Enter Company name field
	driver.findElementById("createLeadForm_companyName").sendKeys("relx");
//Enter first name field
	driver.findElementById("createLeadForm_firstName").sendKeys("John");
//Enter last name field
	driver.findElementById("createLeadForm_lastName").sendKeys("Peter");
//Click create lead button //or name value
    //driver.findElementByClassName("smallSubmit").click();
 //select source dropdown public relations value 
    WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
    Select sc = new Select(eleSource);    
    sc.selectByIndex(8);
    System.out.println(sc);
//select the last before dropdown value in marketing compaign
    WebElement ele = driver.findElementById("createLeadForm_marketingCampaignId");
    Select sel = new Select(ele);
    List<WebElement> options = sel.getOptions();
    System.out.println(options.size());
    int length = options.size();
    sel.selectByIndex(length-2);
    System.out.println(sel);
//Close Browser
    driver.close();
    
	}


}
