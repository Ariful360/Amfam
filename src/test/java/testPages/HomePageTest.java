package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test (enabled = true, priority = 3)
	public void clickSignInTest() throws InterruptedException {
		homePage.clickSignIn();
		
	}
	
	@Test (enabled = true, priority = 2)
	public void clickInsuranceTest() throws InterruptedException {
		homePage.clickSupport();
	}
	
	@Test (enabled = false, priority = 1)
	public void clickFindAgentTest() throws InterruptedException {
		homePage.clickFindAgent();
	}
	

	
	
}
