package systemClassExamples;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int[] empId= new int[5];
		for(int i=0;i<empId.length;i++) {
			System.out.println("Insert Your array Element in index "+i);
			empId[i]= in.nextInt();
		}
		int i=0;
		for(int num:empId) {
			System.out.println("Index"+i+":");
			i++;
		}
		
	}

}
