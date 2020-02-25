package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String FN = "John";
		String Titletext = "salutation";
		String UpdatedCompanyName = "RELX";

		// set the runtime environment
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// open url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// enter username
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesManager");
		// enter passowrd
		driver.findElementById("password").sendKeys("crmsfa");
		// click login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		// Click leads link
		driver.findElementByLinkText("Leads").click();
		// click find leads
		driver.findElementByLinkText("Find Leads").click();
		// Enter first name
		driver.findElementByXPath("//label[text()='Lead ID:']//following::div//label[text()='First name:']/..//following::div/input[@name='firstName']")
				.sendKeys(FN);
		Thread.sleep(1000);
		// Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

		// Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[1]").click();

		// Verify title of the page'
		String title = driver.findElementByXPath("//td/span[text()='Title']//following::td/span").getText();
		if (title.equals(Titletext)) {
			System.out.println("Title of yhe page is correct and script success");
		} else {
			System.out.println("Script fails");
		}
		// Click Edit
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(2000);

		// Change the company name
		// driver.findElementById("createLeadForm_companyName").clear(); //for clearing
		// we have to use only Xpath
		// driver.findElementById("createLeadForm_companyName").sendKeys("RELX");
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("RELX");
		// Click update button
		driver.findElementByXPath("//input[@value=\"Update\"]").click();
		// verify updated name appears

		String updatedcomp = driver.findElementByXPath("//td/span[text()='Company Name']/..//following-sibling::td/span[@class='tabletext']")
				.getText();
		System.out.println(updatedcomp);
		System.out.println("******");
		System.out.println(UpdatedCompanyName);
		if (updatedcomp.contains(UpdatedCompanyName)) {
			System.out.println("Company name is updated");
		} else {
			System.out.println("Company name is not updated");
		}

		driver.close();
		
		

	}

}
