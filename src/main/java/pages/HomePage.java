package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "LoadingButton__content")
	WebElement signIn;
	
	@FindBy(xpath = "//a[text()= 'Customer Support']")
	WebElement support;

	@FindBy(xpath = "//a[@class= 'a-standalone']")
	WebElement findAgent;

	

	public void clickSignIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);

	}

	public void clickSupport() throws InterruptedException {
		support.click();
		Thread.sleep(3000);

	}
	
	public void clickFindAgent() throws InterruptedException {
		findAgent.click();
		Thread.sleep(3000);
	}
}
