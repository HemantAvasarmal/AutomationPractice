package basicObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome");
		driver.get("https://demosite.executeautomation.com/Login.html");
		WebElement userNameInputField=driver.findElement(By.name("userName"));
		userNameInputField.click();
		userNameInputField.sendKeys("admin");
		
	}
		// TODO Auto-generated method stub
		public static WebDriver setUp(String browsername) {		
			if(browsername.equalsIgnoreCase("chrome")) {
				/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				/*2. After setting the path of driver executable, create an instance of required browser*/
				return new ChromeDriver();
			}else if(browsername.equalsIgnoreCase("firefox")) {
				/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
				System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
				/*2. After setting the path of driver executable, create an instance of required browser*/
				return new FirefoxDriver();
			}else if(browsername.equalsIgnoreCase("ie")) {
				/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
				System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
				/*2. After setting the path of driver executable, create an instance of required browser*/
				return new InternetExplorerDriver();
			}
			return null;
			
	}
	
}


