package mouseOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class FlipkartAssignment extends SeleniumUtility {
	WebDriver driver;
	@Test
	public void mouseOver() throws InterruptedException {
	driver=setUp("chrome", "https://www.flipkart.com/");
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> MainMenu=driver.findElements(By.cssSelector(".eFQ30H"));
	System.out.println("Main Menu count :"+MainMenu.size());
	for(int i=1;i<MainMenu.size();i++) {
		WebElement options=MainMenu.get(i);
		act.moveToElement(options).perform();
		//System.out.println("options:"+MainMenu.size().getText());
		Thread.sleep(1000);
	}
	
	
		
		
		
		
	}
}
