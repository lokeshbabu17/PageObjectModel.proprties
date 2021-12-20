package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseHooks {

	public ChromeDriver driver; // driver = null
	public String excelFileName; // initial value is null
	public Properties prop;
	
	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String lang) throws IOException {
		//properties file setup
		if(lang.equals("english")) {
			
			FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
			prop = new Properties();
			prop.load(fis);
		}else if(lang.equals("french")) {
			FileInputStream fis = new FileInputStream("./src/main/resources/french.properties");
			prop = new Properties();
			prop.load(fis);
		}
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(driver); // 2d2fecb52eeed92786b4d82ee121d0d4
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@DataProvider(indices=0)
	public String[][] sendData() throws IOException {
		String[][] readData = ReadExcel.readData(excelFileName);
		return readData;

	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
