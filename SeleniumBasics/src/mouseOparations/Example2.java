package mouseOparations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement>mainMenuOptions=driver.findElements(By.cssSelector("#menu>ul>li>a"));
		System.out.println("Main Menu option Count:"+mainMenuOptions.size());
		Actions Act=new Actions(driver);
		//Act.moveToElement(mainMenuOptions.get(3)).perform();
		for(int i=0;i<mainMenuOptions.size();i++) {
			WebElement Option=mainMenuOptions.get(3);
			Act.moveToElement(Option).perform();
			Thread.sleep(1000);
		Act.moveToElement(Option).contextClick().build().perform();
			Thread.sleep(1000);
			
		}
		
	}

}
