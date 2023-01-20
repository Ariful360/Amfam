package testPages;

import static org.testng.Assert.assertEquals;


import java.time.Duration;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.performance.Performance;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	
	@Test (enabled = false, priority = 21)
	public void clickResourcesTest() throws InterruptedException {
		homePage.clickResources();
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
		driver.get("https://www.amfam.com/");
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
	
	
	@Test(enabled = false, priority = 13)
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
	
	@Test(enabled = false, priority = 14)
	public void useOfRETURN() throws InterruptedException {
		driver.findElement(By.cssSelector("header.SiteHeader:nth-child(2) div.SiteHeader__background div.SiteHeader__main div.SiteHeader__right-nav div.SiteHeaderNavItem:nth-child(1) > button.SiteHeader__submenu-toggle.a._hover-underline")).click();
		driver.findElement(By.cssSelector("input#uid_56")).sendKeys("home", Keys.RETURN);
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 15)
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
	
	@Test(enabled = false, priority = 16)
	public void accccc() throws InterruptedException {
		Dimension dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("https://www.amfam.com/");
		Thread.sleep(3000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("The size of the maximize screen is: " + driver.manage().window().getSize());
		driver.manage().window().setSize(dimension);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		driver.manage().window().fullscreen();
		System.out.println("The size of the fullscreen is: " + driver.manage().window().getSize());
	}

	@Test(enabled = false, priority = 17)
	public void use_of_getTitle_method_with_hard_assertion() throws InterruptedException {
		String expected = "Auto, Home, Life, & More | American Family Insurance";
		String actual = driver.getTitle();
		System.out.println("Title of the Page: " + actual);
		assertEquals(expected, actual, "home page does't match...");
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current URL is: " + currentURL);
	}
	
	
	@Test(enabled = false)
	public void use_of_hard_assertion() throws InterruptedException {
		String expected = "Auto, Home, Life, & More | American Family Insurance";
		String actual = driver.getTitle();
		System.out.println("Actual title: " + actual);
		Assert.assertEquals(actual, expected, "Homepage title does not match");
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.className("SiteHeader__logo-img"));
		boolean displayed = logo.isDisplayed();
		System.out.println("Is Logo displayed: " + displayed);
		Assert.assertTrue(true, "Logo not displayed");
	}
	
	// Will Pass
		@Test(enabled = false)
		public void use_of_getTitle_method_with_soft_assertion() throws InterruptedException {
			// Your expected Title
			String expected = "Auto, Home, Life, & More | American Family Insurance";
			String actual = driver.getTitle();
			System.out.println("The Title of the home Page is: " + actual);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actual, expected, "Home Page Title doesn't match ....... "); 
			// Soft Assertion, execution will not stopped here if Assertion is failed
			String currentURL = driver.getCurrentUrl();
			System.out.println("The current url is: " + currentURL);
			
		}
		
	@Test(enabled=false, priority = 19)
	public void use_of_dropdown_selectByVisisbleText_method () throws InterruptedException {
		Thread.sleep(3000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		select = new Select(dropElement);
		select.selectByVisibleText("Art");
		Thread.sleep(3000);
	}
	
	@Test(enabled=false, priority = 22)
	public void use_of_dropdown_selectByIndex() throws InterruptedException {
		Thread.sleep(3000);	
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement1 = driver.findElement(By.xpath("//select[@id= 'searchDropdownBox']"));
		select = new Select(dropElement1);
		select.selectByIndex(8);
		Thread.sleep(3000);		
	}
	
	@Test(enabled=true, priority = 23)
	public void use_of_dropdown_selectByValue() throws InterruptedException {
		Thread.sleep(2000);	
		driver.get("https://www.amazon.com/ref=nav_logo");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement2 = driver.findElement(By.xpath("//select[@id= 'searchDropdownBox']"));
		select = new Select(dropElement2);
		select.selectByValue("search-alias=amazon-pharmacy");
		Thread.sleep(3000);		
	}
	
	
	@Test(enabled = false, priority = 24)
	public void use_of_hoverAction_on_resources() throws InterruptedException {
		Thread.sleep(3000);
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Thread.sleep(3000);
		actions.moveToElement(resources).build().perform();
		Thread.sleep(3000);
	}
	
	
}
