package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class HomePage extends BaseHooks {
	
	public HomePage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,prop);
	}

}
