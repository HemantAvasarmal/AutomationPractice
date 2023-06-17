package dropdownExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yearExample {

	public static void main(String[] args) {
	//String chromePath= System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",".\\executables\\\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement yearDrop=driver.findElement(By.id("yearbox"));
	Select Selectskill= new Select(yearDrop);
	System.out.println("Given Dropdown is multiselect dropdown :"+Selectskill.isMultiple());
	Selectskill.selectByVisibleText("1993");
	WebElement selectedOption=Selectskill.getFirstSelectedOption();
	System.out.println("Already selected option: "+selectedOption.getText());
	List <WebElement> options=Selectskill.getOptions();
	System.out.println("Options count is :"+options.size());
	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
		
	}
	Select yeardrop=new Select(driver.findElement(By.id("yearbox")));
	List<Integer> years=new ArrayList<Integer>();
	for(int i=1;i<yeardrop.getOptions().size();i++) {
		String year=yeardrop.getOptions().get(i).getText();
		years.add(Integer.parseInt(year));
}
	List <Integer> dupyear= new ArrayList<Integer>();
	//dupMonth.addAll(month);
	Collections.sort(dupyear);
	System.out.println(years.equals(dupyear));
	
	
	
	}

}
