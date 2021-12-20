package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;

public class CreateLead extends BaseHooks {
	
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String company, 
			                  String firstName, String lastName) throws InterruptedException {
			
		LoginPage lp = new LoginPage(driver,prop); 
		
		lp.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyFirstName();
		

	}

}
