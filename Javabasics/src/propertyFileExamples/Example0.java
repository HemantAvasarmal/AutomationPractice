package propertyFileExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis1=new FileInputStream("C:\\AUTOMATION TESTING\\WORKSPACE\\Javabasics\\AppData\\Demo.properties");
		Properties prop=new Properties();
		prop.load(fis1);
		String name=prop.getProperty("username");
		System.out.println(""+name);
		System.out.println(prop.getProperty("password"));
		String firstname=prop.getProperty("firstname");
		System.out.println(firstname);
	System.out.println(prop.getProperty("email"));
		String lastname=prop.getProperty("lastname");
		System.out.println(lastname);
		
		
	}

}
