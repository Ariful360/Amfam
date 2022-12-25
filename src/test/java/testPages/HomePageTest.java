package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test (enabled = false)
	public void clickSignInTest() throws InterruptedException {
		homePage.clickSignIn();
		
	}
	
	@Test (enabled = true)
	public void clickInsuranceTest() throws InterruptedException {
		homePage.clickSupport();
	}
	
	@Test (enabled = false)
	public void clickFindAgentTest() throws InterruptedException {
		homePage.clickFindAgent();
	}
	

	
	
}
