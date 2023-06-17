package dropdownExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class colorCodeValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerButton= driver.findElement(By.className("ico-register"));
		String registerButtonColor=registerButton.getCssValue("color");
		System.out.println("Register button :"+registerButtonColor);
		String registerButtonFontFamily=registerButton.getCssValue("font-family");
		System.out.println("Register button font family :"+registerButtonFontFamily);
		WebElement LoginButton= driver.findElement(By.className("ico-login"));
		String LoginButtoncolor=LoginButton.getCssValue("color");
		System.out.println("LoginButton color :"+LoginButtoncolor);
		String LoginButtonFontFamily=LoginButton.getCssValue("font-family");
		System.out.println("LoginButton font family :"+LoginButtonFontFamily);
		WebElement shoppingCart= driver.findElement(By.cssSelector(".header-links-wrapper>div>div"));
		String shoppingCartcolor=shoppingCart.getCssValue("color");
		System.out.println("shoppingCart color :"+shoppingCartcolor);
		String shoppingCartFontFamily=shoppingCart.getCssValue("font-family");
		System.out.println("shoppingCart font family :"+shoppingCartFontFamily);
		WebElement WishlistButton= driver.findElement(By.cssSelector(".header-links-wrapper>div>ul>li>a>span"));
		String WishlistButtoncolor=WishlistButton.getCssValue("color");
		System.out.println("WishlistButton color :"+WishlistButtoncolor);
		String WishlistButtonFontFamily=shoppingCart.getCssValue("font-family");
		System.out.println("WishlistButton font family :"+WishlistButtonFontFamily);
		WebElement searchButton= driver.findElement(By.cssSelector(".header-links-wrapper>div>ul>li>a>span"));
		String searchButtoncolor=searchButton.getCssValue("color");
		System.out.println("searchButton color :"+searchButtoncolor);
		String searchButtonFontSize=shoppingCart.getCssValue("font-size");
		System.out.println("searchButton font size :"+searchButtonFontSize);
		
		


	}

}
