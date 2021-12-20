package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MyLeadsPage extends BaseHooks {
	public MyLeadsPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.xpath(prop.getProperty("MyLeadsPage.xpath.CreateLead"))).click();
		return new CreateLeadPage(driver,prop);

	}

}
