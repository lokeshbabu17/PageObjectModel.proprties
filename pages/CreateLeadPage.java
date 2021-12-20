package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class CreateLeadPage extends BaseHooks {
	public CreateLeadPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public CreateLeadPage enterCompanyName(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);

		return this;
	}

	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();

		return new ViewLeadPage(driver,prop);

	}

}
