package testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class OrangeHRMExample extends SeleniumUtility{
	WebDriver driver;
	@Test
	public void orangeHRMlogin() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameInputField=driver.findElement(By.cssSelector("//input[@placeholder='Username']"));
		usernameInputField.sendKeys("Admin");
		

		
	}

}
