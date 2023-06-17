package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;
import webpages.ActitimeHomePage;
import webpages.ActitimeLoginPage;

public class TestActitimeLogin extends SeleniumUtility{
	ActitimeLoginPage getActitimeLoginPage;
	ActitimeHomePage getActitimeHomePage;
	WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver=setUp(getValueFromPropertyFile("browserName"),getValueFromPropertyFile("appUrl"));
		getActitimeLoginPage =new ActitimeLoginPage(driver);
		getActitimeHomePage=new ActitimeHomePage(driver);
	}
	
	@Test
	public void testLoginWithValidData() {
		
		getActitimeLoginPage.enterUserName(getValueFromPropertyFile("username"));
		getActitimeLoginPage.enterPassword(getValueFromPropertyFile("password"));
		getActitimeLoginPage.clickOnLoginButton();
		String expectedTitle=getValueFromPropertyFile("homePageTitle");
		String actualTitle=getCurrentTitleOfApplication(expectedTitle);
		Assert.assertEquals(actualTitle,expectedTitle,"Either Login is failed or Homepage got changed");
	
	}
	@AfterMethod
	public void postCondition() {
		cleanUp();
		
	}
	
}
