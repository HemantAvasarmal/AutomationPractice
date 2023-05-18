package day7.ifelseExamples;

import java.util.Scanner;

public class Example10 {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter the age from the keyboard");
		age=sc.nextInt();
		if(age>18) {
			System.out.println("You are eligible for voting");
		}else {
			System.err.println("You are not eligible for voting");
		}
	}

}


