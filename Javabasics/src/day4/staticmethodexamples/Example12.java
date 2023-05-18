package day4.staticmethodexamples;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=multiplyTwoNumbers(10,30);
		System.out.println("result is :"+res);
		int finalvalue=res+200;
		System.out.println("updated final value is :"+finalvalue);
		
	}
		public static int multiplyTwoNumbers(int num1,int num2) {
			System.out.println("number 1 is :"+num1);
			System.out.println("number 2 is :"+num2);
			int res=num1*num2;
			return res;
		}
}
