package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// set the runtime environment
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// to launch the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// open url https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// EnteruserID
		driver.findElementById("email").sendKeys("saransgoodfortune@gmail.com");
		// Enter Password
		driver.findElementById("pass").sendKeys("samsaran1234");
		// Click Login //input[@value="Log In"]
		driver.findElementByXPath("//input[@value=\"Log In\"]").click();
		// Enter Text filed in search as test leaf
		Thread.sleep(1000);
		driver.findElementByClassName("_1frb").sendKeys("TestLeaf");
		//Click Search button
		driver.findElementByXPath("//button[@aria-label=\"Search\"]").click();
		// Navigate to places
		driver.findElementByXPath("(//li/a/div/div[text()='Places'])[1]").click();
		// verify test leaf is present or not
		String text = driver.findElementByXPath("//span/a[text()='TestLeaf']").getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Exp Text is found");
		} else {
			System.out.println("Expected Text not found");
		}
        //verify like
		String liketext = driver.findElementByXPath("(//div/span/button[text()='Like'])[1]").getText();
		String likedtext = driver.findElementByXPath("(//div/span/button[text()='Like'])[1]").getText();

		if (liketext.equals("Like")) {

			driver.findElementByXPath("(//div/span/button[text()='Like'])[1]").click();
			System.out.println("Like is present and hence clicked");

		} else if (likedtext.equals("Liked")) {
			System.out.println("Liked in present and hence report as already liked");

		}

//click link test leaf
		driver.findElementByXPath("//a[text()='TestLeaf']").click();

		// span/h1/a/span[text()='TestLeaf']
		String linktext = driver.findElementByXPath("//span/h1/a/span[text()='TestLeaf']").getText();

		if (linktext.equals("TestLeaf")) {

			System.out.println("TestLeaf text is present in the title");
		} else {
			System.out.println("Title is not present");

		}
		// div[contains(text(),'people like this')]
		String numberoflikes = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
		System.out.println(numberoflikes);

	}

}
