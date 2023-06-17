package basicObjectIdentification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=setUp("chrome");
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement makeFunction=driver.findElement(By.id("make"));
		System.out.println("Make functionality is Displayed:"+makeFunction.isDisplayed());
		System.out.println("make functionality is Enabled:"+makeFunction.isEnabled());
		System.out.println("Make functionality is Selected:"+makeFunction.isSelected());
		WebElement Engineperformance=driver.findElement(By.id("engineperformance"));
		System.out.println("Engineperformance functionality is Displayed:"+Engineperformance.isDisplayed());
		System.out.println("Engineperformance functionality is Enabled:"+Engineperformance.isEnabled());
		System.out.println("Engineperformance functionality is Selected:"+Engineperformance.isSelected());
		WebElement dateofmanufacture=driver.findElement(By.id("dateofmanufacture"));
		System.out.println("dateofmanufacture functionality is Displayed:"+ dateofmanufacture.isDisplayed());
		System.out.println("dateofmanufacture functionality is Enabled:"+ dateofmanufacture.isEnabled());
		System.out.println("dateofmanufacture functionality is Selected:"+ dateofmanufacture.isSelected());
		WebElement numberofseats=driver.findElement(By.id("numberofseats"));
		System.out.println("numberofseats functionality is Displayed:"+numberofseats.isDisplayed());
		System.out.println("numberofseats functionality is Enabled:"+numberofseats.isEnabled());
		System.out.println("numberofseats functionality is Selected:"+numberofseats.isSelected());
		WebElement fueltype=driver.findElement(By.id("fuel"));
		System.out.println("fueltype functionality is Displayed:"+fueltype.isDisplayed());
		System.out.println("fueltype functionality is Enabled:"+fueltype.isEnabled());
		System.out.println("fueltype functionality is Selected:"+fueltype.isSelected());
		WebElement listprice=driver.findElement(By.id("listprice"));
		System.out.println("listprice functionality is Displayed:"+listprice.isDisplayed());
		System.out.println("listprice functionality is Enabled:"+listprice.isEnabled());
		System.out.println("listprice functionality is Selected:"+listprice.isSelected());
		WebElement licenseplatenumber=driver.findElement(By.id("licenseplatenumber"));
		System.out.println(" licenseplatenumber functionality is Displayed:"+ licenseplatenumber.isDisplayed());
		System.out.println(" licenseplatenumber functionality is Enabled:"+ licenseplatenumber.isEnabled());
		System.out.println(" licenseplatenumber functionality is Selected:"+ licenseplatenumber.isSelected());
		WebElement annualmileage=driver.findElement(By.id("annualmileage"));
		System.out.println(" annualmileage functionality is Displayed:"+ annualmileage.isDisplayed());
		System.out.println(" annualmileage functionality is Enabled:"+ annualmileage.isEnabled());
		System.out.println(" annualmileage functionality is Selected:"+ annualmileage.isSelected());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	public static WebDriver setUp(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
			return new ChromeDriver();
			}else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\geckodriver.exe");
				return new FirefoxDriver();
			}else if(browsername.equalsIgnoreCase("microsoft edge")) {
				System.setProperty("webdriver.microsof.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\msedgedriver.exe");
				return new EdgeDriver();
			}
		return null;
	}
}
