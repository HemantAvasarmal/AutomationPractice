package exceptionHandlingExamples;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ref= new Scanner(System.in);
		int age;
		System.out.println("Eneter the age value from the console");
		age=Ref.nextInt();
		if(age<=18) {
			System.err.println("Not Eligible for vote");
		throw new ArithmeticException("Person is Not Eligible For vote");
		}else{
		System.out.println("Person is Eligible for vote");
		}
	}
}


