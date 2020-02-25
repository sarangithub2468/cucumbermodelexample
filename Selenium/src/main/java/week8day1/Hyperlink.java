package week8day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {

		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
		//open url 
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		List<WebElement> alllinks = driver.findElementsByTagName("a");
		/*for(int i=0;i<alllinks.size();i++) {
			alllinks=driver.findElementsByTagName("a");
			String text = alllinks.get(i).getText();
			alllinks.get(i).click();
			if (driver.getTitle().contains("404"))
			System.out.println("Link is broken  "+text);
			driver.navigate().back();
			alllinks =  driver.findElementsByTagName("a");
		}*/
		//approach 2
		for(WebElement eachLink : alllinks) {
			String attribute = eachLink.getAttribute("href");
			System.out.println(attribute);
			if(RestAssured.get(attribute).getStatusCode()==404) {
				System.out.println(eachLink.getText());
			}
		}
          
		
		
	}

}
