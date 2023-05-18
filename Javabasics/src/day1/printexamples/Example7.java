package day1.printexamples;

import java.util.Scanner;

public class Example7 {
	
	public static void main(String args[]) {
	Scanner scnRef =new Scanner(System.in);
	int age;
	double salary;
	String name;
	System.out.println("Enter age value from console");
	age = scnRef.nextInt();
	System.out.println("Enter salary value from console");
	salary= scnRef.nextDouble();
	System.out.println("Enter string value from console");
	name= scnRef.next();
	System.out.println("Age :"+age);
	System.out.println("Salary :"+salary);
	System.out.println("Name :"+name);
	int num1;int num2;
	System.out.println("Enter num1 value from console");
	num1=scnRef.nextInt();
	System.out.println("Enter num2 value from console");
	num2= scnRef.nextInt();
	
	}
}
