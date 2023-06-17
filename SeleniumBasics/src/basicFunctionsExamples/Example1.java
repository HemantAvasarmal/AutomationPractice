package basicFunctionsExamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\chromedriver.exe");
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.get("https://www.facebook.com");
		System.out.println(cdriver.getTitle());
		cdriver.close();
		
	}

}
/*Admin Acceleration10:10 PM
========== TC1 ===========
open browser
enter application URL https://demo.vtiger.com/vtigercrm/index.php
enter username as admin
enter password as Test@123
click on sign button
validate home page

========== TC2 ===========
open browser
enter application URL https://demosite.executeautomation.com/Login.html
enter username as admin
enter password as admin
click on login button
validate home page and logout
 * 
 * 
 * 
 * 
 *TC-03
 * http://sampleapp.tricentis.com/101/app.php
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
