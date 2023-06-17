package cssSelectorExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class Example6 {
	static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtil.setUp("chrome","https://google.com");
		WebElement searchField=driver.findElement(By.id("textarea#APjFqb"));
		searchField.click();
		searchField.sendKeys("autamation testing interview questions");
		
	}

}
