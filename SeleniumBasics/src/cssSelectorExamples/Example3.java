package cssSelectorExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.demo.automationtesting.in/Register.html");
		List<WebElement> MenuCount=driver.findElements(By.cssSelector(".col-md-3 col-xs-3 col-sm-3 control-label"));
		System.out.println("total product count:"+MenuCount.size());
		for(int i=0;i<MenuCount.size();i++) {
			System.out.println(MenuCount.get(i).getText());
	}

  }
}
