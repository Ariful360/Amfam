package testPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	
	@Test (enabled = false, priority = 1)
	public void clickSignInTest() throws InterruptedException {
		homePage.clickSignIn();
		homePage.clickUserId();
		homePage.inputTextUserId();
		homePage.inputTextPassword();
		homePage.clickCheckBox();
		homePage.clickSignIn1();
	}
	
	@Test (enabled = false, priority = 6)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	@Test (enabled = false, priority = 5)
	public void clickInsuranceTest() throws InterruptedException {
		homePage.clickSupport();
	}
	
	@Test (enabled = false, priority = 3)
	public void clickFindAgentTest() throws InterruptedException {
		homePage.clickFindAgent();
	}
	
	@Test (enabled = false, priority = 4)
	public void clickFcontactUsTest() throws InterruptedException {
		homePage.clickContactUs();
	}
	
	@Test (enabled = false, priority = 7)
	public void clickFeedbackTest() throws InterruptedException {
		homePage.clickFeedback();
	}
	
	@Test(enabled = false, priority = 8)
	public void use_of_sendKeys_click_and_clear() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).sendKeys("Airpods");
		Thread.sleep(5000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).clear();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).sendKeys("Chargers");
		Thread.sleep(5000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);

	}

	@Test(enabled = false, priority = 9)
	public void use_of_isEnabled_in_cart_icon() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		boolean cartEnabled = driver.findElement(By.className("gh-cart-icon")).isEnabled();
		System.out.println("Is the cart icon Enable? Ans: " + cartEnabled);
	}

	@Test(enabled = false, priority = 10)
	public void use_of_isSelected_StartNewQuote() throws InterruptedException {
		boolean startNewQuote = driver.findElement(By.xpath("//button[contains (text(), 'Start a New')]")).isSelected();
		System.out.println("Is the cart icon Enable? Ans: " + startNewQuote);

	}

	@Test(enabled = false, priority = 11)
	public void getTitle_in_signin_page() throws InterruptedException {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
		System.out.println("The Title of the site is: " + driver.getTitle());
	}

	@Test(enabled = false, priority = 12)
	public void currentURL_in_customer_support_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()= 'Customer Support']")).click();
		System.out.println("The CurrentURL of the site is: " + driver.getCurrentUrl());
	}
	
	
	@Test(enabled = true, priority = 13)
	public void useOfSendKeys() throws InterruptedException {
		driver.findElement(By.cssSelector("header.SiteHeader:nth-child(2) div.SiteHeader__background div.SiteHeader__main div.SiteHeader__right-nav div.SiteHeaderNavItem:nth-child(1) > button.SiteHeader__submenu-toggle.a._hover-underline")).click();
		driver.findElement(By.cssSelector("input#uid_56")).sendKeys("home");
		Thread.sleep(3000);
	}
	
	@Test(enabled = false, priority = 13)
	public void useOfENTER() throws InterruptedException {
		driver.findElement(By.cssSelector("header.SiteHeader:nth-child(2) div.SiteHeader__background div.SiteHeader__main div.SiteHeader__right-nav div.SiteHeaderNavItem:nth-child(1) > button.SiteHeader__submenu-toggle.a._hover-underline")).click();
		driver.findElement(By.cssSelector("input#uid_56")).sendKeys("home", Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 14)
	public void useOfRETURN() throws InterruptedException {
		driver.findElement(By.cssSelector("header.SiteHeader:nth-child(2) div.SiteHeader__background div.SiteHeader__main div.SiteHeader__right-nav div.SiteHeaderNavItem:nth-child(1) > button.SiteHeader__submenu-toggle.a._hover-underline")).click();
		driver.findElement(By.cssSelector("input#uid_56")).sendKeys("home", Keys.RETURN);
		Thread.sleep(3000);
	}
	
	public void useOfNavigateMethod() throws InterruptedException {
		driver.navigate().to("https://www.peacocktv.com/watch/home");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	
}
