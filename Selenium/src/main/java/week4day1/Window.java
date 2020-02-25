package week4day1;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
		//open url 
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");	
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		////button[text()='Try it']
		driver.findElementByXPath("//button[text()='Try it']").click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> winlist =  new ArrayList<String>(allwin);
		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(winlist.get(0));
		driver.close();
		
		
		

	} 

}
