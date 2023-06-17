package cssSelectorExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		List<WebElement> ProductCount=driver.findElements(By.cssSelector(""));
		System.out.println("total product count:"+ProductCount.size());
		for(int i=0;i<ProductCount.size();i++) {
			System.out.println(ProductCount.get(i).getText());
	}

  }

}


