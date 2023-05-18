package propertyFileExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String currentdir=System.getProperty("user.dir");
		String filelocation=currentdir+("\\AppData\\Demo1.properties");
		FileInputStream fis=new FileInputStream(filelocation);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("firstname"));
		prop.setProperty("test1","java");
		FileOutputStream fos=new FileOutputStream("C:\\AUTOMATION TESTING\\WORKSPACE\\Javabasics\\AppData\\Demo1.properties");
		prop.store(fos, "added two new keys");
		fos.close();
		System.out.println("Property file updated successfully");
	}

}
