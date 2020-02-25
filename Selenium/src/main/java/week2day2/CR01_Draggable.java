package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CR01_Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
	//open url navigate to draggable
		driver.get("http://jqueryui.com/draggable/");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//drag and drop
		//id="draggable"
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
	//WebElement target = driver.findElementByXPath("//body/div[@style=\"position: relative; left: 138px; top: 201px;\"]");
		int x = 100 ;
		int y = 100 ;			
		//build used in version 2. here it is not necessary
		builder.dragAndDropBy(drag, x, y).perform();
        driver.close();
		
		
	}

}
