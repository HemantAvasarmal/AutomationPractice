package day4.staticmethodexamples;

public class Example14 {
	public static void main(String[] args) {
	getQuotientAndRemainder(25,10);
	System.out.println("Ascii value :"+getAsciivalue('A'));
	addTwoNumbers(23,45);
	}
	public static void getQuotientAndRemainder(double num1,double num2) {
		System.out.println("num1 is :"+num1);
		System.out.println("num2 is :"+num2);
		double getQuotient =num1/num2;
		System.out.println("Quotient is :"+getQuotient);
		double getRemainder =num1%num2;
		System.out.println("Remainder is :"+getRemainder);
	}
		public static int getAsciivalue(char A) {
		return A;
	}
		public static void addTwoNumbers(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Result is :"+res);
		 return;
		 
		}
}
	

