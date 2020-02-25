package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Printheader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// set the runtime environment
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// open url
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement table = driver.findElementByXPath("//div/table[@id='customers']");
		List<WebElement> allRow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < 1; i++) {
			String s = allRow.get(i).getText();
			System.out.println("Headers in all three columns are  "  +s);
			String column1headername = driver.findElementByXPath("//tbody/tr/th[1]").getText();
			String column2headername = driver.findElementByXPath("//tbody/tr/th[2]").getText();
			String column3headername = driver.findElementByXPath("//tbody/tr/th[3]").getText();
			System.out.println("Column 1 headername is    " + column1headername);
			System.out.println("Column 2 header name is    " + column2headername);
			System.out.println("Column 3 header name is    " + column3headername);

		}
	}
}
	
