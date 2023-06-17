package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class HandlingAlert extends SeleniumUtility{
	WebDriver driver;
	@Test
	public void testalert() throws InterruptedException {
		driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(1000);
		String AlertMsg=driver.switchTo().alert().getText();
		System.out.println("Alert Pop upMsg:"+AlertMsg);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
	}

}
