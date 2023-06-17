package day1.OpenBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\AUTOMATION TESTING\\WORKSPACE\\SeleniumBasics\\executables\\msedgedriver.exe");
		EdgeDriver ed= new EdgeDriver();
		ed.get("https://www.google.com");
	}

}
