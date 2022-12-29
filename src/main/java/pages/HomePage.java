package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[4]/button[1]")
	WebElement signIn;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/form[1]/div[3]/div[1]/div[1]/label[1]/span[1]")
	WebElement checkBox;

	@FindBy(className = "LoadingButton__content")
	WebElement signIn1;

	@FindBy(className = "SiteHeader__logo-img")
	WebElement logo;

	@FindBy(xpath = "//a[text()= 'Customer Support']")
	WebElement support;

	@FindBy(xpath = "//a[@class= 'a-standalone']")
	WebElement findAgent;

	@FindBy(xpath = "//a[text()= 'Contact Us']")
	WebElement contactUs;
	@FindBy(xpath = "//a[@id='oo_tab']")
	WebElement feedback;

	public void clickSignIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
	}

	public void clickCheckBox() throws InterruptedException {
		checkBox.click();
		Thread.sleep(3000);
	}

	public void clickSignIn1() throws InterruptedException {
		signIn1.click();
		Thread.sleep(3000);
	}

	public void clickLogo() throws InterruptedException {
		logo.click();
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

	public void clickContactUs() throws InterruptedException {
		contactUs.click();
		Thread.sleep(3000);
	}

	public void clickFeedback() throws InterruptedException {
		contactUs.click();
		Thread.sleep(3000);
	}

}
