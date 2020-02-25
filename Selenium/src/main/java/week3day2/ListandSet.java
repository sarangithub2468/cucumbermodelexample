package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListandSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//https://github.com/TestLeafPages/SeleniumJuly/blob/master/Week2day2/LearnWebTable.java	
		//set the runtime environment
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
	//to launch the browser
		 ChromeDriver driver = new ChromeDriver();
		//open url 
			driver.get("http://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//table[@class='DataTable TrainList TrainListHeader']
			//table
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
			//Row Count
			List<WebElement> allRow = table.findElements(By.tagName("tr"));
			System.out.println(allRow.size());
			
			//List<String> trainnames = new ArrayList<String>();
			//List<train name>
			//td[@class="Sorted"]
			//int size = trainnames.size();	
			//System.out.println("SIZE: "+size);
			//table[@class='DataTable TrainList TrainListHeader']//td[2]
		    List<WebElement> allColumn = table.findElements(By.xpath("//td[@class=\"Sorted\"]"));
			System.out.println(allColumn.size());
			for(WebElement secondcolumnname : allColumn) {
			System.out.println(secondcolumnname.getText());		
			
			System.out.println("ooooooooooooooo");
			List<String> trainnamecount = new ArrayList<String>();
			trainnamecount.get(0);
			System.out.println(secondcolumnname);
			
     }
		 
		
		
		
		
		

	}

}
