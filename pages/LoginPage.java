package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class LoginPage extends BaseHooks{
	
	public LoginPage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	
	
	
				//action+FieldName
	public LoginPage enterUsername(String uName) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver,prop);

	}

}
