package xPathExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement usernameInputField=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameInputField.click();
		usernameInputField.sendKeys("standard_user");
		WebElement passwordInputField=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordInputField.click();
		passwordInputField.sendKeys("secret_sauce",(Keys.ENTER));
		Thread.sleep(2000);
		List<WebElement>inventoryCount=driver.findElements(By.cssSelector(".inventory_list"));
		System.out.println("Total Inventory list:"+inventoryCount.size());
		for(int i=0;i<inventoryCount.size();i++) {
			System.out.println(inventoryCount.get(i).getText());
		}
		
		
	}

}
