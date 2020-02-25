package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void openTheChromeBrowser() {
  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     driver = new ChromeDriver();
	}

	@Given("max the browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();

	}

	@Given("set the timeout")
	public void setTheTimeout() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Given("load the url")
	public void loadTheUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");	

	}

	@Given("enter the username (.*) in the login page")
	public void enterTheUsernameDemosalesmanagerInTheLoginPage(String Demo) {
		WebElement eleUsername = driver.findElementById("username");	
		eleUsername.sendKeys(Demo);
	}

	@Given("enter the password (.*) in the login page")
	public void enterThePasswordCrmsfaInTheLoginPage(String pass) {
		driver.findElementById("password").sendKeys(pass);

	}

	@When("click on the login button in the login page")
	public void clickOnTheLoginButtonInTheLoginPage() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Then("verify whether the login is success")
	public void verifyWhetherTheLoginIsSuccess() {
	 System.out.println("Login success");
	}
	 
	 @Given("click on the crmsfa link in loginpage")
		public void clickonthecrmsfalinkinloginpage() {
			driver.findElementByLinkText("CRM/SFA").click();
	 }
	 
			
	@Given("click on the createlead in MyHomepage")
			public void clickonthecreateleadinMyHomepage() {
		driver.findElementByLinkText("Create Lead").click();
	}

		
		@Given("enter the companyname Cname in the login page")
		public void enterthecompanynameCnameintheloginpage(String Cname) {
			driver.findElementById(Cname).sendKeys("relx");	
		}
			@Given("enter the companyname Fname in the login page")
			public void entertheFirstnameFnameintheloginpage(String Fname) {
				driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
			}
			
			@Given("enter the companyname Lname in the login page")
			public void entertheLastnameLnameintheloginpage(String Lname) {
				driver.findElementById("createLeadForm_lastName").sendKeys("Peter");
			}	
}
