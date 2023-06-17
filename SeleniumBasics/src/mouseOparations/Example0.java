package mouseOparations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.click();
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.click();
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		password.sendKeys(Keys.ENTER);
		
		
		
		
	}

}
