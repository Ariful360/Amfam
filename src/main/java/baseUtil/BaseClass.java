package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/arifulislam/eclipse-workspace/com.amfam/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amfam.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void tear() {
		driver.quit();
	}
	
}