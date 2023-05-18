package day6.operators;

public class RelationalExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res=simpleInterest(10000,7.5,12);
		System.out.println("Simple interest is="+res);
		double res1=multiplyTwoNumbers(12,10);
		System.out.println("Multiplication of two number is="+res1);
	}
	public static double simpleInterest(int p, double r,int t) {
		System.out.println("Priciple amount is="+p);
		System.out.println("rate of Interest is="+r);
		System.out.println("time is="+t);
		double res=(p*r*t)/100;
		return res;
	}
	public static double multiplyTwoNumbers(int num1, int num2) {
		System.out.println("\nnumber 1 is="+num1);
		System.out.println("number 2 is="+num2);
		double res1=num1*num2;
		return res1;
	}
}
		