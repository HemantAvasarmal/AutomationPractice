package cssSelectorExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		List<WebElement> ProductCount=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("total product count:"+ProductCount.size());
		List<WebElement> ProductPrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		for(int i=0;i<ProductCount.size();i++) {
			System.out.println(ProductCount.get(i).getText());
			System.out.println(ProductPrice.get(i).getText());
		}
	}

}
