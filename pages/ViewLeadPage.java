package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class ViewLeadPage extends BaseHooks {

	public ViewLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public ViewLeadPage verifyFirstName() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

}
