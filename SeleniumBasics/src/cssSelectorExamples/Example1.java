package cssSelectorExamples;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		List<WebElement> SamsungProductCount=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		System.out.println("Total Samsung Phones Count:"+SamsungProductCount.size());
		
		for(int i=0;i<SamsungProductCount.size();i++) {
			System.out.println(SamsungProductCount.get(i).getText());
		}
	}

}
