package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	
	@Test (enabled = false, priority = 1)
	public void clickSignInTest() throws InterruptedException {
		homePage.clickSignIn();
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
	
	
}
