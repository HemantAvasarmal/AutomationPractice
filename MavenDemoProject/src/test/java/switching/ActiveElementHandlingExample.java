package switching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementHandlingExample{
	static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement element=driver.switchTo().activeElement();
		String Exp=element.getAttribute("placeholder");
		if(Exp.equals("Username")) {
			System.out.println("mouser pointer is in username field");
			element.sendKeys("admin",Keys.TAB);
			Thread.sleep(1000);
		}
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		Thread.sleep(1000);
	}
	

}
