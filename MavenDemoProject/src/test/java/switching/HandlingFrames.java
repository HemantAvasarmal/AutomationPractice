package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingFrames extends SeleniumUtility{
	WebDriver driver;
	@Test
	public void dragAndDropInsideTheFrame() throws InterruptedException {
		//SeleniumUtility m1=new SeleniumUtility();
		driver=setUp("chrome","https://jqueryui.com/");
		Actions act=new Actions(driver);
		WebElement droppable=driver.findElement(By.xpath("//a[text()='Droppable']"));
		droppable.click();
		//driver.switchTo().frame(0);
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		performDragAndDrop(src,dest);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".logo")).click();
		
		
		
		
		
		
		
		
	}

}
