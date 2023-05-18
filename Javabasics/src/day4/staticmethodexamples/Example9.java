package day4.staticmethodexamples;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getQuotientAndRemainder(25,7);
	}
	public static void getQuotientAndRemainder(int n1, int n2) {
		System.out.println("number 1 is:"+n1);
		System.out.println("number 2 is:"+n2);
		int Quotient=n1/n2;
		int Remainder=n1%n2;
		System.out.println("Quotient is :"+Quotient);
		System.out.println("Remainder is :"+Remainder);
	}
}
