package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


 public class ProjectSpecificFunction {
		public ChromeDriver driver;
		@Parameters({"url","username","password"})
		@BeforeMethod
				public void startApp(String url,String username,String password) {
				// set the runtime environment
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// to launch the browser
				driver = new ChromeDriver();
				// open url
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				// enter username
				WebElement eleUsername = driver.findElementById("username");
				eleUsername.sendKeys(username);
				// enter passowrd
				driver.findElementById("password").sendKeys(password);
				// click login
				driver.findElementByClassName("decorativeSubmit").click();
				// Click CRMSFA link
				driver.findElementByLinkText("CRM/SFA").click();		
	}


 @AfterMethod
	public void closeApp() {
		driver.close();
		
 }
 }