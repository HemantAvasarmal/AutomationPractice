package basicObjectIdentification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
	ChromeDriver cd=new ChromeDriver();
	cd.get("https://www.saucedemo.com/");
	cd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement username=cd.findElement(By.id("user-name"));
	username.click();
	username.sendKeys("standard_user");
	WebElement password=cd.findElement(By.id("password"));
	password.click();
	password.sendKeys("secret_sauce");
	WebElement login=cd.findElement(By.id("login-button"));
	login.click();
	WebElement button=cd.findElement(By.id("react-burger-menu-btn"));
	button.click();
	WebElement logout=cd.findElement(By.id("logout_sidebar_link"));
	logout.click();
	
	}

}
