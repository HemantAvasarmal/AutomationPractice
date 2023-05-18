package propertyFileExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\AUTOMATION TESTING\\WORKSPACE\\Javabasics\\AppData\\signupdata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("test1"));
		System.out.println(prop.getProperty("position"));
		System.out.println(prop.getProperty("email"));
		/*FileOutputStream fos=new FileOutputStream("C:\\AUTOMATION TESTING\\WORKSPACE\\Javabasics\\AppData\\signupdata.properties");
		Properties prop1=new Properties();
		prop1.setProperty("test1","java");
		prop1.store(fos, "added two keys");
		fos.close();
		System.out.println("updated sucessfully");*/
		
		
}
	

}
