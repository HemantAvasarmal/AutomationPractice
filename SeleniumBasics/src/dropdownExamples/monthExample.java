package dropdownExamples;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class monthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=setUp("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skillDropdown= driver.findElement(By.id("Skills"));
		Select selectSkill=new Select(skillDropdown);
		System.out.println("Given dropdown is multiselect dropdown or not: "+selectSkill.isMultiple());
		WebElement selectedOption=selectSkill.getFirstSelectedOption();
		String selectedOptionName= selectedOption.getText();
		System.out.println("Already selected Option Name: "+selectedOptionName);
		List <WebElement> option=selectSkill.getOptions();
		System.out.println("Option count is: "+option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());
		}
			selectSkill.selectByIndex(2);
			selectSkill.selectByVisibleText("Adobe Photoshop");
			Select monthDrop=new Select(driver.findElement(By.id("daybox")));
			List<Integer> months=new ArrayList<Integer>();
			for(int i=1;i<monthDrop.getOptions().size();i++) {
				String day=monthDrop.getOptions().get(i).getText();
				months.add(Integer.parseInt(day));
		}
			List <Integer> dupMonth= new ArrayList<Integer>();
			//dupMonth.addAll(month);
			Collections.sort(dupMonth);
			System.out.println(months.equals(dupMonth));
		
			
		
			
		 }
	
		
	
	public static WebDriver setUp(String browsername) {		
		if(browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new InternetExplorerDriver();
		}
		return null;
	}

}





