package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class MergeLeads extends ProjectSpecificFunction {
@Test
	public void runmergeleads() throws InterruptedException {
		// TODO Auto-generated method stub
		

		// click Leads
		driver.findElementByLinkText("Leads").click();
		//click merge leads
		driver.findElementByLinkText("Merge Leads").click();
		Thread.sleep(1000);

		//click on icon near from lead
		driver.findElementByXPath("(//table//span[text()='From Lead']//following::table//input//following::input[@id='partyIdFrom']//following::a/img)[1]")
				.click();
		Thread.sleep(2000);
		// String parentWinHandle = driver.getWindowHandle();

		// move to new window
		Set<String> allwindow = driver.getWindowHandles();
		List<String> alllistwin = new ArrayList<String>(allwindow);
		String Parentwindow = alllistwin.get(0);
		String childwindow = alllistwin.get(1);

		// String childwindow2 = alllistwin.get(1);

		// switch to child 1 window
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		// Enter Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10");
		Thread.sleep(1000);
		// Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		// Click first resulting lead
		driver.findElementByXPath(
				"(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[1]").click();
		// driver.close();
		Thread.sleep(1000);
		// Switch back to Parent window
		driver.switchTo().window(Parentwindow);
		Thread.sleep(1000);
		//// click on icon near to lead
		driver.findElementByXPath("(//table//span[text()='To Lead']//following::table//input//following::input[@id='partyIdTo']//following::a/img)[1]")
				.click();
		Thread.sleep(2000);
		Set<String> allwindow2 = driver.getWindowHandles();
		List<String> alllistwin2 = new ArrayList<String>(allwindow2);
		String Parentwindow1 = alllistwin2.get(0);
		String childwindow1 = alllistwin2.get(1);
		// switch to child 2 window
		driver.switchTo().window(childwindow1);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(1000);

		// Enter Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10");
		Thread.sleep(1000);
		// Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);

		// Click first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[1]").click();
		Thread.sleep(1000);
		// Switch back to primary window
		driver.switchTo().window(Parentwindow1);
		Thread.sleep(1000);
		// click merge //td/a[text()='Merge']
		driver.findElementByXPath("//td/a[text()='Merge']").click();
		// Accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// click find leads
		driver.findElementByLinkText("Find Leads").click();
		// Enter from Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10");

		// Click find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.close();
		// verify error message

		/*
		 * for(String handle: alllistwin) { if(!handle.equals(parentWinHandle)) {
		 * driver.switchTo().window(handle); driver.manage().window().maximize();
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle());
		 */

	}

}
