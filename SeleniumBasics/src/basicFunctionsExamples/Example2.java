package basicFunctionsExamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		ChromeDriver cdr=new ChromeDriver();
		cdr.get("https://www.google.com/");
		System.out.println(cdr.getCurrentUrl());
		System.out.println(cdr.getPageSource());
		cdr.close();
	}

}
