package systemClassExamples;

import java.util.Scanner;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Ref= new Scanner(System.in);
		int age;
		double salary;
		String Name;
		
		System.out.println("Enter age value from console");
		age= Ref.nextInt();
		System.out.println("Enter salary value from console");
		salary= Ref.nextDouble();
		System.out.println("Enter String value from console");
		Name= Ref.next();
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Name :"+Name);
		
		
		
	}

}
