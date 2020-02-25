package testng;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import project.ProjectSpecificFunction;
import utils.ReadExcel;


public class Createlead extends ProjectSpecificFunction {
	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		return ReadExcel.readData("createlead");
		/*ReadExcel read = new ReadExcel();
		Object[][] readData = read.readData(n);
		return readData;
	*/
	
	}
	
	@Test(dataProvider ="fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
	
	
	
}