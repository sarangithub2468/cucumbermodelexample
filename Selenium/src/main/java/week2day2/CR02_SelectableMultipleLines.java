package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CR02_SelectableMultipleLines {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
	//open url navigate to Selectable
		driver.get("http://jqueryui.com/selectable/");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//click multiple lines
		driver.switchTo().frame(0);

		Actions builder = new Actions(driver);
				//WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
				//WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		
		WebElement eleitem1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement eleitem2 = driver.findElementByXPath("//li[text()='Item 2']");
		builder.keyDown(Keys.CONTROL).click(eleitem1).click(eleitem2).keyDown(Keys.CONTROL).build().perform();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
		
  
	}

}
