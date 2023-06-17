package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingConfirmationPopup extends SeleniumUtility {
	WebDriver driver;
	@Test
	public void testalert() {
		driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String AlertText=driver.switchTo().alert().getText();
		System.out.println("Alert msg :"+AlertText);
		driver.switchTo().alert().dismiss();
		
	}

}
