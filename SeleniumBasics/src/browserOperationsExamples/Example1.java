package browserOperationsExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
	ChromeDriver cd=new ChromeDriver();
	cd.get("https://www.techlistic.com/");
	cd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	cd.manage().window().maximize();
	WebElement developement=cd.findElement(By.tagName("a"));
	developement.click();                 
	}

}
