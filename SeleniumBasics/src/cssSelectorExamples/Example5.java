package cssSelectorExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		WebElement from=driver.findElement(By.cssSelector("#src"));
		from.click();
		from.sendKeys("Pune");
		WebElement from1=driver.findElement(By.xpath("//li[@select-id='results[0].BpList[0]']"));
		from1.click();
		WebElement To=driver.findElement(By.cssSelector("#dest"));
		To.click();
		To.sendKeys("Goa");
		WebElement To1=driver.findElement(By.xpath("//li[@select-id='results[0].BpList[1]']"));
		To1.click();
		WebElement date=driver.findElement(By.xpath("//input[@id='onward_cal']"));
		date.click();
		WebElement date1=driver.findElement(By.xpath("//input[@id='onward_cal']']"));
		date1.click();
		WebElement search=driver.findElement(By.xpath("//button[@id='search_btn']"));
		search.click();
		
		
		
		
		

	}

}
