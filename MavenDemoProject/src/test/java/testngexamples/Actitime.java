package testngexamples;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Actitime extends SeleniumUtility{
 WebDriver driver;
	@Test
	public void a_openBrowserAndAppUrl() {
	driver=setUp("chrome", "https://demo.actitime.com/login.do");
	//String actualPageTitle=getCu
		
	}
}
