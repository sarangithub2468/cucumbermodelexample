package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// set the runtime environment
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// open url
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement table = driver.findElementByXPath("//div/table/tbody");
				
    List<WebElement> rows = table.findElements(By.tagName("tr"));
    int rowcount = rows.size();
    System.out.println("no of rows are   "   +rowcount);
    for (int i=0;i<rowcount;i++) {
    	//System.out.println(i);
    String rowvalues = rows.get(i).getText();
    System.out.println("Values of rows are"   +rowvalues);
    List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
     int columncount = columns.size();
    System.out.println("no of columns are   "   +columncount);
    
    for (int j=0;j<columncount;j++) {
    	//System.out.println(j);
     String columnvalues = columns.get(j).getText();
     System.out.println("Values of columns are"   +columnvalues);
    }
    
    }
    
	}

}
