package week4day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsandframes  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
		//open url 
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");	
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		////button[text()='Try it']
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myalert = driver.switchTo().alert();
		//myalert.sendKeys(Keys.ENTER)
		myalert.sendKeys("sar");
		myalert.accept();
	    //driver.switchTo().defaultContent();
		String txt = driver.findElementById("demo").getText();
		System.out.println(txt);
		if(txt.contains("sar")) {
			System.out.println("pass");
			}
		else {
			System.out.println("fail");
		}
		driver.close();


		

	}

}
