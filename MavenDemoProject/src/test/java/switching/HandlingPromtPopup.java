package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingPromtPopup extends SeleniumUtility {
	WebDriver driver;
	@Test
	public void testalert() {
		driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String AlertText=driver.switchTo().alert().getText();
		System.out.println("Alert msg :"+AlertText);
		driver.switchTo().alert().sendKeys("Raver");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
	}

}



