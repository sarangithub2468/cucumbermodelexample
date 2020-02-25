package week3day2;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomtrainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("chkSelectDateOnly").click();
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowSize = rows.size();
		List<String> trains = new ArrayList<String>();
		for (int i = 0; i < rowSize; i++) {
			WebElement firstRow = rows.get(i);
			trains.add(firstRow.findElements(By.tagName("td")).get(1).getText());
		}
		int listSize = trains.size();
		if (listSize == rowSize) {
			System.out.println();
		} else {
			System.out.println();
		}

	

	}

}
