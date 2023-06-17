package cssSelectorExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin{
	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement UsernameInputField=driver.findElement(By.name("username"));
			UsernameInputField.sendKeys("admin");
			WebElement PasswordInputField=driver.findElement(By.name("pwd"));
			PasswordInputField.sendKeys("manager",Keys.ENTER);
			WebElement TaskCreation=driver.findElement(By.cssSelector(".content.tasks"));
			TaskCreation.click();
			WebElement AddNewButton=driver.findElement(By.cssSelector(".title.ellipsis"));
			AddNewButton.click();
			WebElement createNewTask=driver.findElement(By.cssSelector(".item.createNewTasks"));
			createNewTask.click();
			WebElement dropdownTab=driver.findElement(By.cssSelector(".emptySelection"));
			dropdownTab.click();
			
			
			
			
			
					
	}

 }

