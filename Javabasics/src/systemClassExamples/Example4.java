package systemClassExamples;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value from the console");
		sc.nextInt();
		int age = 0;
		if(age>=18) {
			System.out.println("You are eligible to donate blood");
		}else{
			System.out.println("You are not eligible to donate blood");
		}
		age=sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
	}

}
