package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificFunction  {
   
	@DataProvider(name="fetchData")
		public Object[][] sendData(){
		String[][] data = new String[2][3];
		data[0][0]="Testleaf";
		data[0][1]="Sethu";
		data[0][2]="ram";		
		data[1][0]="Test";
		data[1][1]="james";
		data[1][2]="ren";				
		return data;		
		}
	@Test (dataProvider ="fetchData")
	public void runcreatelead(String cname,String fname,String lname) {     
		//String text ="John";
		// Click create lead2
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		// Enter first name field
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		// Enter last name field
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("james");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("heyen");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("salutation");
	    driver.findElementById("createLeadForm_generalProfTitle").sendKeys("salutation");
	    driver.findElementById("createLeadForm_annualRevenue").sendKeys("5000000");
	    driver.findElementById("createLeadForm_sicCode").sendKeys("2588");
	    driver.findElementById("createLeadForm_importantNote").sendKeys("recordandperform");
	    driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
	    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("118");
	    driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("055");
	    driver.findElementById("createLeadForm_departmentName").sendKeys("TLF");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("1000");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("##");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("ss@gmail.com");

		// choose source
		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");	
		Select source = new Select(ele);
		source.selectByIndex(2);
		// choose market compaign
		WebElement ele1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketcom = new Select(ele1);
		marketcom.selectByIndex(2);
		// choose industry
		WebElement ele2 = driver.findElementById("createLeadForm_industryEnumId");
		Select indus = new Select(ele2);
		indus.selectByIndex(2);
		// Click create lead
		driver.findElementByClassName("smallSubmit").click();
		String firstnametext = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstnametext.equals(cname)) {
			System.out.println("First name is present and script is successful");

		}

		else {
			System.out.println("First name is not present and script failed");
		}
		driver.close();
		
	}
	}

