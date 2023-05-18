package systemClassExamples;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		double salary;
		int roll ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value from the console:");
		name=sc.next();
		System.out.println("Enter the age value from the console:");
		age=sc.nextInt();
		System.out.println("Enter the roll number:");
		roll=sc.nextInt();
		System.out.println("Enter the salary:");
		salary=sc.nextDouble();
		System.out.println(""+name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(roll);
	}

}
