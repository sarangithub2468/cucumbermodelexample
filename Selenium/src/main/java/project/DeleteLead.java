package project;

import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificFunction {

	@Test public void runDeletelead() throws InterruptedException {
        //startApp();		

   //click Leads
		driver.findElementByLinkText("Leads").click();
	//Click Find Leads
		driver.findElementByLinkText("Find Leads").click();
	//click phone no:
		driver.findElementByXPath("//span[text()='Phone']").click();;
		//name="phoneNumber"
	// enter phone number text
		driver.findElementByName("phoneNumber").sendKeys("2");
	//click find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	    Thread.sleep(1000);	
	   //capture lead id of the first resulting lead
		String firstlead = driver.findElementByXPath("(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[1]").getText();
		System.out.println(firstlead);
	    Thread.sleep(1000);	

	    //Click first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-header']//div//following::table/tbody//a[@class='linktext'])[1]").click();
	    Thread.sleep(1000);	

	    //Click Delete
		driver.findElementByLinkText("Delete").click();
	    Thread.sleep(1000);	

	    //click find leads
		driver.findElementByLinkText("Find Leads").click();
	    Thread.sleep(1000);	

	    //Enter captured  lead ID
		//label[text()='Lead ID:']/..//following::div/input[@name='id']
		//driver.findElementByXPath("//label[text()='Lead ID:']/..//following::div/input[@name='id']").clear();
		driver.findElementByXPath("//label[text()='Lead ID:']/..//following::div/input[@name='id']").sendKeys(firstlead);
	    Thread.sleep(1000);	


	    //Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	    Thread.sleep(1000);	

	    //Verify error message'
	    String errortext= driver.findElementByXPath("//div[text()='No records to display']").getText();
        if(errortext.equals("No records to display")) {
        	System.out.println("ID is deleted and script passed");
        }
        else {
        	System.out.println("ID is not deleted and script fails");
        }
	    //close the browser
	    driver.close();
		
		

	}

}
