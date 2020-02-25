package project;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import cucumber.api.java.it.Date;

public class Zoomcar {

	@Test
	   public void runzoomcar() throws InterruptedException  {
		// TODO Auto-generated method stub

		/*
		 * Zoom Car Application
		 * 
		 * 1. Open Chrome Browser 2. Open https://www.zoomcar.com/chennai/ 3. Click on
		 * the Start your wonderful journey link 4. In the Search page, Click on the any
		 * of the pick up point under POPULAR PICK-UP POINTS 5. Click on the Next button
		 * 6. Specify the Start Date as tomorrow Date 7. Click on the Next Button
		 * 
		 * 8. Confirm the Start Date and Click on the Done button 9. In the result page,
		 * capture the number of results displayed. 10. Find the highest value and
		 * report the brand name. 11. click on the Book Now button for it. 12. Close the
		 * Browser.
		 */

		// set the runtime environment
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// open url
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// 3.Click on the Start your wonderful journey link
		driver.findElementByLinkText("Start your wonderful journey").click();
		// 4.In the Search page, Click on the any of the pick up point under POPULAR
		Thread.sleep(3000);
		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
		// 5. Click on the Next button
		driver.findElementByXPath("//div/button[text()='Next']").click();
		Thread.sleep(1000);

		Calendar calendar = Calendar.getInstance();
		//java.util.Date today = calendar.getTime();

		calendar.add(Calendar.DAY_OF_YEAR, 1);
		java.util.Date tomorrow = calendar.getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		//String todayAsString = dateFormat.format(today);
		String tomorrowAsString = dateFormat.format(tomorrow);
		//System.out.println(todayAsString);
		System.out.println("System Tomorrow date is   "   +tomorrowAsString); 
		String str = tomorrowAsString; 
        String[] arrOfStr = str.split("-"); 
        for (String a : arrOfStr) 
            System.out.println("Split the whole system date   "    +a);
         String b = arrOfStr[0];
         System.out.println("Split the system tomorrow date and store only number and the result is   "    +b);
         System.out.println("+++++++++++++++");
        //System.out.println();
          //(//div[contains(text(),'25')])[1]
         // 6. Specify the Start Date as tomorrow Date
		WebElement txt = driver.findElementByXPath("(//div[contains(text(),'"+b+"')])[1]");
		String dateinpage = txt.getText();
		System.out.print("Date available in webpage matching with the system tomorrow date is   "  +dateinpage);

		driver.findElementByXPath("(//div[contains(text(),'"+b+"')])[1]").click();
			// 7. Click on the Next Button
			driver.findElementByXPath("//div/button[text()='Next']").click();
			// 8. Confirm the Start Date and Click on the Done button
			Thread.sleep(1000);
			driver.findElementByXPath("//div/button[text()='Done']").click();

			List<Integer> list = new ArrayList<Integer>();
			List<WebElement> list1 = driver.findElementsByXPath("//div[@class='price']");

			for (WebElement car : list1) {
				String carlist = car.getText(); // store it in variable String
				//System.out.println(carlist);
				String carlist1 = carlist.replaceAll("\\D", "");
				list.add(Integer.parseInt(carlist1));
				
						}
			int max = Collections.max(list);
			//String maxCur = NumberFormat.getCurrencyInstance().format(max);
			//System.out.println(maxCur);
			long newValue = Integer.toUnsignedLong(max);
			//System.out.println(newValue);
			//(//div[contains(text(),'1,215')]/preceding::h3)[1]
			String s = NumberFormat.getIntegerInstance().format(newValue);
			System.out.println("Maximum price of car available is  "     +s);
	    
			String carbrandname = driver.findElementByXPath("//div[contains(text(),'"+s+"')]//../../..//div/div/../h3").getText();
			System.out.println("Maximum value which carbrand costs is  "    +carbrandname);
			driver.close();
			}

			}

