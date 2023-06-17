package mouseOparations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class Example1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtil.setUp("chrome","http://demo.automationtesting.in/Register.html");
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.click();
		firstName.sendKeys("admin",(Keys.chord(Keys.CONTROL,"a")));
		Thread.sleep(2000);
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.click();
		lastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	}

}
