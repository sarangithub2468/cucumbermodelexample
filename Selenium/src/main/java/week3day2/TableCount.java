package week3day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to launch the browser
			 ChromeDriver driver = new ChromeDriver();
			//open url 
				driver.get("http://testleaf.herokuapp.com/pages/table.html");	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
//				List<WebElement> elenew = driver.findElementsByXPath("//table/tbody/tr[2]/td");
//                int size = elenew.size();
//                System.out.println(size);
//                List<WebElement> elenew1 = driver.findElementsByXPath("//table/tbody/tr");
//                int size1 = elenew1.size();
//                System.out.println(size1);
//                
//                WebElement get = elenew.get(1);
//                System.out.println(get);
				WebElement table = driver.findElementByTagName("table");
				List<WebElement> allrow = table.findElements(By.tagName("tr"));
				System.out.println(allrow.size());
				
				//get 2nd row (0,1,2..)
				WebElement secondele = allrow.get(1);
			   
				//allcolumns
				List<WebElement> allcolumns = secondele.findElements(By.tagName("td"));
				System.out.println(allcolumns.size());
				
				 for(int i=1;i<allrow.size();i++) {
					 WebElement eachrow = allrow.get(i);
					 List<WebElement> allcolumn = eachrow.findElements(By.tagName("td"));
					 WebElement fircolumn = allcolumn.get(0);
					 String text = fircolumn.getText();
					// System.out.println(text);
							 //System.out.println("***********");
				 
							if(text.equals("Learn to interact with Elements"))
							{
								WebElement secondcolumn = allcolumn.get(1);
								System.out.println(secondcolumn.getText());
							}
									
				 }
							 
							 
					 
				 
				
				   
               
                
	}

}
