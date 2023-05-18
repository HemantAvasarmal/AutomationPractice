package day7.ifelseExamples;

public class Example4 {

	public static void main(String[] args) {
		int num1 = 14, num2 = 14;
		System.out.println("num1: " + num1 + "--->num2: " + num2);//
		// is equal to
		boolean res = (num1 == num2);
		System.out.println("num1 == num2 = " + res);// 
				//or
		System.out.println("num1 == num2 = " + (num1 == num2));// 
		// is not equal to
		System.out.println("num1 != num2 = " + (num1 != num2));// 
		// Greater than
		System.out.println("num1 >  num2 = " + (num1 > num2));// 
		// Less than
		System.out.println("num1 <  num2 = " + (num1 < num2));// 
		// Greater than or equal to
		System.out.println("num1 >= num2 = " + (num1 >= num2));// 
		// Less than or equal to
		System.out.println("num1 <= num2 = " + (num1 <= num2));// 
	}
}