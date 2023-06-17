package basicFunctionsExamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver chr =new ChromeDriver();
		chr.get("https://demo.actitime.com/");
		System.out.println(chr.getTitle());
		System.out.println(chr.getTitle().length());
		System.out.println(chr.getCurrentUrl());
		System.out.println(chr.getPageSource());
		System.out.println(chr.getPageSource().length());
		chr.close();
		
	}

}
