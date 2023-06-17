package day1.OpenBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	}

}
