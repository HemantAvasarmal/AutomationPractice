package browserOperationsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		System.out.println("amazon home page Title :"+cd.getTitle());
		WebElement signIn=cd.findElement(By.id("nav-link-accountList-nav-line-1"));
		signIn.click();
		System.out.println("Sign in Title :"+cd.getTitle());
		cd.navigate().back();
		System.out.println(cd.getTitle());
		System.out.println("verify both title:"+cd.getTitle().equals(cd.getTitle()));
		cd.close();
		
		
	}

}
