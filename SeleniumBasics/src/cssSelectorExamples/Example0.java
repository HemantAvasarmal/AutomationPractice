package cssSelectorExamples;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> PhonesCount= driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("Total phones count:"+PhonesCount.size());
		
		for(int i=0;i<PhonesCount.size();i++) {
			System.out.println(PhonesCount.get(i).getText());
		}
		
	}

}
