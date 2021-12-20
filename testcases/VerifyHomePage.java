package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class VerifyHomePage extends BaseHooks {
	
	@BeforeTest
	public void setValues() {
		excelFileName = "Login";

	}
	
	@Test /* (dataProvider = "sendData") */
	public void runVerifyHomePage() throws InterruptedException {
		
	//	LoginPage lp = new LoginPage();
		
		new LoginPage(driver,prop)
		.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.verifyHomePage();
		
		}

}
