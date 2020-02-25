package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// set the runtime environment
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// open url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// enter username
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesManager");
		// enter passowrd
		driver.findElementById("password").sendKeys("crmsfa");
		// click login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		// click Leads
		driver.findElementByLinkText("Leads").click();
		// Click Find Leads
		driver.findElementByLinkText("Find Leads").click();
		// click email
		driver.findElementByXPath("//span[text()='Email']").click();
		// enter email
		driver.findElementByName("emailAddress").sendKeys("ss@gmail.com");
		Thread.sleep(1000);

		// click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);

		// capture name of first resulting lead
		String capturedfirstleadname = driver
				.findElementByXPath(
						"(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[5]	")
				.getText();
		System.out.println(capturedfirstleadname);
		Thread.sleep(1000);

		// click first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[1]").click();

		// Click duplicate lead
		driver.findElementByLinkText("Duplicate Lead").click();
		Thread.sleep(1000);

		// verify the title page as duplicate lead 
		String titleduplicate = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		System.out.println(titleduplicate);
		if (titleduplicate.equals("Duplicate Lead")) {
			System.out.println("title duplciate lead is present");
		} else {
			System.out.println("title duplicate lead is not present");
		}
		// Click create lead
		driver.findElementByClassName("smallSubmit").click();

		// confirm the duplicated lead name is same as captured name
		String duplciatedleadname = driver
				.findElementByXPath(
						"//td/span[text()='Company Name']/..//following-sibling::td/span[@class='tabletext']")
				.getText();
		System.out.println(duplciatedleadname);
		System.out.println("******");
		System.out.println(capturedfirstleadname);
		if (duplciatedleadname.contains(capturedfirstleadname)) {
			System.out.println("Lead is successfully duplicated");
		} else {
			System.out.println("ERROR --- Lead is not successfully duplicated");
		}
		//driver.close();

	}

}
