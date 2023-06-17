package basicObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example0 {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		WebElement signinInputField=driver.findElement(By.className("buttonBlue"));
		 signinInputField.click();
		 
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


