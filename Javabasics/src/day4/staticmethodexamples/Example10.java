package day4.staticmethodexamples;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwoNumbers(15,25);
	}
	public static void swapTwoNumbers(int num1,int num2) {
		System.out.println("Before swap number 1 is :"+num1);
		System.out.println("Before swap number 2 is :"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap number 1 is :"+num1);
		System.out.println("After swap number 2 is :"+num2);
	}

}
