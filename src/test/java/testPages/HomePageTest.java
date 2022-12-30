package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	
	@Test (enabled = true, priority = 1)
	public void clickSignInTest() throws InterruptedException {
		homePage.clickSignIn();
		homePage.clickUserId();
		homePage.inputTextUserId();
		homePage.inputTextPassword();
		homePage.clickCheckBox();
		homePage.clickSignIn1();
	}
	
	@Test (enabled = true, priority = 6)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	@Test (enabled = true, priority = 5)
	public void clickInsuranceTest() throws InterruptedException {
		homePage.clickSupport();
	}
	
	@Test (enabled = true, priority = 3)
	public void clickFindAgentTest() throws InterruptedException {
		homePage.clickFindAgent();
	}
	
	@Test (enabled = true, priority = 4)
	public void clickFcontactUsTest() throws InterruptedException {
		homePage.clickContactUs();
	}
	
	@Test (enabled = true, priority = 7)
	public void clickFeedbackTest() throws InterruptedException {
		homePage.clickFeedback();
	}
	
	
}
