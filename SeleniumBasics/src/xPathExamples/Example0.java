package xPathExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example0 {

	public static void main(String[] args) {
	String chromePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromePath);
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebDriverWait wait= new WebDriverWait(driver,20);
	driver.get("https://www.saucedemo.com/");

	

	}

}
